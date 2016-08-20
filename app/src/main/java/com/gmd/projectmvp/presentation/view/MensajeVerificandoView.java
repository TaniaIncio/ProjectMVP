package com.gmd.projectmvp.presentation.view;

import com.gmd.projectmvp.data.services.response.CoberturaServicioOutRO;

/**
 * Created by tincio on 22/07/2016.
 */
public interface MensajeVerificandoView extends MvpView {

    public void showCoberturaOutRO(CoberturaServicioOutRO mCoberturaOutRO, String message);
}
