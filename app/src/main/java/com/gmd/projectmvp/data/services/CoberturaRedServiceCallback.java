package com.gmd.projectmvp.data.services;

import com.gmd.projectmvp.data.services.response.CoberturaServicioOutRO;

/**
 * Created by tincio on 01/08/2016.
 */
public interface CoberturaRedServiceCallback {

    public void onCallbackVerificarRed(CoberturaServicioOutRO mCobertura, String message);
}
