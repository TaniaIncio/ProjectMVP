package com.gmd.projectmvp.domain.callback;

import com.gmd.projectmvp.data.services.response.CoberturaServicioOutRO;

/**
 * Created by tincio on 22/07/2016.
 */
public interface MensajeVerificandoCallback {
    /**Verificar red de gas por tu localidad*/
    public void onResponseVerificarRed(CoberturaServicioOutRO mCobertura, String message);
}
