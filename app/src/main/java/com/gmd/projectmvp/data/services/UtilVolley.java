package com.gmd.projectmvp.data.services;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.gmd.projectmvp.presentation.application.ProjectMVPApplication;
import com.gmd.projectmvp.presentation.util.Constants;

import org.json.JSONObject;


public class UtilVolley {

	/**Funcion POST*/

	public static void getRequestWithPOST(String url, JSONObject objJSON, final UtilVolleyCallback callback) {
		ProjectMVPApplication application = ProjectMVPApplication.getInstance();// getApplication(ctx);
		if (application != null) {

			JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
					url,objJSON,
					new Response.Listener<JSONObject>() {
						@Override
						public void onResponse(JSONObject response) {
							callback.onResponse(response.toString(),false);
						}
					},
					new Response.ErrorListener() {
						@Override
						public void onErrorResponse(VolleyError error) {
							if(error.networkResponse == null){
								callback.onResponse(Constants.Error.timeOutError, true);
							}
							else{
								callback.onResponse(Constants.Error.serverError, true);
							}
						}
					});
			jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(
					Constants.TIMEOUT, DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
					DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

			application.getRequestQueue().add(jsonObjectRequest);

		}
	}

}
