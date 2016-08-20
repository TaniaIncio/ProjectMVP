package com.gmd.projectmvp.domain.interactor;

import android.content.Context;

import com.gmd.projectmvp.data.model.DataOpciones;
import com.gmd.projectmvp.domain.callback.OpcionesMainCallback;

/**
 * Created by tincio on 22/07/2016.
 */
public class OpcionesMainInteractor {
    OpcionesMainCallback callback;
    DataOpciones dataOpciones;
    Context context;

    public OpcionesMainInteractor(OpcionesMainCallback callback, Context context){
        this.callback = callback;
        this.context = context;
    }

    public void getListOpciones(){
        try{
            dataOpciones = new DataOpciones(context);
            callback.onResponse(dataOpciones.getListaOpciones());
        }catch(Exception e){
            throw e;
        }
    }


}
