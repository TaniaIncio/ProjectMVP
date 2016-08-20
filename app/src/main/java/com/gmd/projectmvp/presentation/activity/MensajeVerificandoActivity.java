package com.gmd.projectmvp.presentation.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gmd.projectmvp.R;
import com.gmd.projectmvp.data.services.request.CoberturaServicioInRO;
import com.gmd.projectmvp.data.services.response.CoberturaServicioOutRO;
import com.gmd.projectmvp.presentation.presenter.MensajeVerificandoPresenter;
import com.gmd.projectmvp.presentation.util.AlertSender;
import com.gmd.projectmvp.presentation.view.MensajeVerificandoView;
import com.google.gson.Gson;

public class MensajeVerificandoActivity extends AppCompatActivity implements MensajeVerificandoView {

    MensajeVerificandoPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);
        getSupportActionBar().hide();
        presenter = new MensajeVerificandoPresenter();
        presenter.setView(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();
        presenter.getVerificarRed(setCobertura(extras.getDouble("latitud"),
                extras.getDouble("longitud")));
    }

    @Override
    public void showCoberturaOutRO(CoberturaServicioOutRO mCoberturaOutRO, String message) {
        if(mCoberturaOutRO== null){
            AlertSender.showAlert(this, message);
        }else{
          //  startActivity(intent);
        }
    }

    @Override
    public Context getContext() {
        return this;
    }


    public CoberturaServicioInRO setCobertura(Double latitud, Double longitud){
        CoberturaServicioInRO mCobertura = new CoberturaServicioInRO();
        mCobertura.setCantidadMetros(50);
        mCobertura.setCoordenadaX(latitud.toString());
        mCobertura.setCoordenadaY(longitud.toString());
        mCobertura.setToken("0000");
        return mCobertura;
    }
}
