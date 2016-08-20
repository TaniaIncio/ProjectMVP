package com.gmd.projectmvp.domain.interactor;

import android.content.Context;

import com.gmd.projectmvp.data.services.CoberturaRedService;
import com.gmd.projectmvp.data.services.CoberturaRedServiceCallback;
import com.gmd.projectmvp.data.services.request.CoberturaServicioInRO;
import com.gmd.projectmvp.data.services.response.CoberturaServicioOutRO;
import com.gmd.projectmvp.domain.callback.MensajeVerificandoCallback;

/**
 * Created by tincio on 22/07/2016.
 */
public class MensajeVerificandoInteractor implements CoberturaRedServiceCallback{
    MensajeVerificandoCallback callback;
    Context context;

    public MensajeVerificandoInteractor(MensajeVerificandoCallback callback, Context context){
        this.callback = callback;
        this.context = context;
    }

    /**Devuelve objeto para verificar si la red pasa por su vivienda*/
    public void getVerificarRed(CoberturaServicioInRO mCobertura){
        try{
            CoberturaRedService service = new CoberturaRedService();
            service.getCoberturaRed(mCobertura, this);
        }catch(Exception e){
            throw e;
        }
    }

    @Override
    public void onCallbackVerificarRed(CoberturaServicioOutRO mCobertura, String message) {
        callback.onResponseVerificarRed(mCobertura , message);
    }


}
