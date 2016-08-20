package com.gmd.projectmvp.data.model;

import android.content.Context;

import com.gmd.projectmvp.R;

/**
 * Created by tincio on 25/07/2016.
 */
public class DataOpciones {

    Context context;
    public DataOpciones(Context context){
        this.context = context;
    }
    public String[] getListaOpciones(){
        try{
            return context.getResources().getStringArray(R.array.array_elements_recycler);
        }catch(Exception e){
            throw e;
        }
    }

}
