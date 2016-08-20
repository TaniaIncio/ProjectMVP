package com.gmd.projectmvp.presentation.util;

import android.app.AlertDialog;


/**
 * Created by tincio on 14/12/2015.
 */
public class Util {

    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

    static AlertDialog.Builder builder = null;
    static AlertDialog alert = null;

    //verificar gps activo
   /* public static boolean checkGpsActived(final Activity activity) {
        try {
            LocationManager manager = (LocationManager) activity.getSystemService(Context.LOCATION_SERVICE);
            closedialog();
            if (manager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                Log.i("checkIn", "gps on");
                return true;
            } else {
                Log.i("checkIn", "gps off");
                //   if(builder==null)
                builder = new AlertDialog.Builder(activity);
                builder.setMessage(activity.getResources().getString(R.string.aviso_activegps))
                        //.setCancelable(false)
                        *//**Mejoras*//*
                        .setCancelable(false)
                        *//***//*
                        .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                            public void onClick(@SuppressWarnings("unused") final DialogInterface dialog, @SuppressWarnings("unused") final int id) {
                                Intent intent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                activity.getApplicationContext().startActivity(intent);
                            }
                        })
                        .setNegativeButton("Reintentar", new DialogInterface.OnClickListener() {
                            public void onClick(final DialogInterface dialog, @SuppressWarnings("unused") final int id) {
                                checkGpsActived(activity);
                            }
                        });
                //  if(alert==null)
                alert = builder.create();
                alert.show();
            }
            return false;
        } catch (Exception e) {
            throw e;
        }
    }*/

}
