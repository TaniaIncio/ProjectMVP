package com.gmd.projectmvp.data.services;
import com.gmd.projectmvp.data.services.request.CoberturaServicioInRO;
import com.gmd.projectmvp.data.services.response.CoberturaServicioOutRO;
import com.gmd.projectmvp.presentation.util.Constants;
import com.google.gson.Gson;

/**
 * Created by tincio on 01/08/2016.
 */
public class CoberturaRedService implements UtilVolleyCallback {

    CoberturaRedServiceCallback mCallback;
    public void getCoberturaRed(CoberturaServicioInRO mCobertura, CoberturaRedServiceCallback mCallback){
        try{
            this.mCallback = mCallback;
            UtilVolley.getRequestWithPOST(Constants.Servicios.POST_VERIFICAR_RED, mCobertura.toJSON(),this);
        }catch(Exception e){
            throw e;
        }
    }

    @Override
    public void onResponse(String response, Boolean isError) {
        Gson gson = new Gson();
        CoberturaServicioOutRO mCoberturaResp = null;
        if(isError==false)
            mCoberturaResp = gson.fromJson(response, CoberturaServicioOutRO.class);

        mCallback.onCallbackVerificarRed(mCoberturaResp, response);
    }
}
