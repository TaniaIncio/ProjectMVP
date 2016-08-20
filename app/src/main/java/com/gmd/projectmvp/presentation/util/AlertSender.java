package com.gmd.projectmvp.presentation.util;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class AlertSender {


	public static void showAlert(Context ctx, String msg,final String... callBackName)
	{
		final AppCompatActivity activity = (AppCompatActivity)ctx;
		closedialog();
		builder = new android.app.AlertDialog.Builder(activity);
		builder.setMessage(msg)
				/*.setCancelable(false)*/
				.setCancelable(false)
				.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
					public void onClick(@SuppressWarnings("unused") final DialogInterface dialog, @SuppressWarnings("unused") final int id) {
						try {
						/*	if (callBackName != null) {
								Method method = activity.getClass().getMethod(callBackName[0]);
								method.invoke(activity);
							}*/
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
		alert = builder.create();
		alert.show();

	}

	///cerrar dialog
	static android.app.AlertDialog.Builder builder = null;
	static android.app.AlertDialog alert = null;
	public static void closedialog(){
		try{
			if(builder!=null){
				if(alert!=null){
					alert.cancel();
				}
			}else{
				Log.i("builder = null", "builder = null");
			}
		}catch(Exception e){
			throw e;
		}
	}


}