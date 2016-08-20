package com.gmd.projectmvp.presentation.presenter;

import com.gmd.projectmvp.domain.callback.OpcionesMainCallback;
import com.gmd.projectmvp.domain.interactor.OpcionesMainInteractor;
import com.gmd.projectmvp.presentation.view.OpcionesMainView;

/**
 * Created by tincio on 22/07/2016.
 */
public class OpcionesMainPresenter implements MvpPresenter<OpcionesMainView>, OpcionesMainCallback {

    OpcionesMainView view;
    OpcionesMainInteractor interactor;
    @Override
    public void setView(OpcionesMainView view) {
        this.view = view;
        interactor = new OpcionesMainInteractor(this,view.getContext());
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    /**Para mostrar listado de opciones*/
    @Override
    public void onResponse(String[] arrayOpciones) {
        view.showListOpciones(arrayOpciones);
    }


    public void getListOpciones(){
        interactor.getListOpciones();
    }
    /**fin mostrar listado de opciones*/

}
