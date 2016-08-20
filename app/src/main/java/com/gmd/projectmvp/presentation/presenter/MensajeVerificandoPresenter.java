package com.gmd.projectmvp.presentation.presenter;

import com.gmd.projectmvp.data.services.request.CoberturaServicioInRO;
import com.gmd.projectmvp.data.services.response.CoberturaServicioOutRO;
import com.gmd.projectmvp.domain.callback.MensajeVerificandoCallback;
import com.gmd.projectmvp.domain.interactor.MensajeVerificandoInteractor;
import com.gmd.projectmvp.presentation.view.MensajeVerificandoView;

/**
 * Created by tincio on 22/07/2016.
 */
public class MensajeVerificandoPresenter implements MvpPresenter<MensajeVerificandoView>, MensajeVerificandoCallback {

    MensajeVerificandoView view;
    MensajeVerificandoInteractor interactor;
    @Override
    public void setView(MensajeVerificandoView view) {
        this.view = view;
        interactor = new MensajeVerificandoInteractor(this,view.getContext());
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    /**Para verificar si la red pasa por tu vivienda*/
    public void getVerificarRed(CoberturaServicioInRO mCobertura){
        interactor.getVerificarRed(mCobertura);
    }

    @Override
    public void onResponseVerificarRed(CoberturaServicioOutRO mCobertura, String message) {
        view.showCoberturaOutRO(mCobertura, message);
    }
    /***Fin verificar red*/
}
