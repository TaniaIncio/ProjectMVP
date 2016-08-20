
package com.gmd.projectmvp.data.services.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoberturaServicioOutRO {

    @SerializedName("fechaActualizacion")
    @Expose
    private String fechaActualizacion;
    @SerializedName("resultadoIndFise")
    @Expose
    private String resultadoIndFise;
    @SerializedName("resultadoIndGasNatural")
    @Expose
    private String resultadoIndGasNatural;
    @SerializedName("resultadoIndMecanismoPromoci\u00f3n")
    @Expose
    private String resultadoIndMecanismoPromocion;
    @SerializedName("ubigeo")
    @Expose
    private Integer ubigeo;

    /**
     * 
     * @return
     *     The fechaActualizacion
     */
    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * 
     * @param fechaActualizacion
     *     The fechaActualizacion
     */
    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    /**
     * 
     * @return
     *     The resultadoIndFise
     */
    public String getResultadoIndFise() {
        return resultadoIndFise;
    }

    /**
     * 
     * @param resultadoIndFise
     *     The resultadoIndFise
     */
    public void setResultadoIndFise(String resultadoIndFise) {
        this.resultadoIndFise = resultadoIndFise;
    }

    /**
     * 
     * @return
     *     The resultadoIndGasNatural
     */
    public String getResultadoIndGasNatural() {
        return resultadoIndGasNatural;
    }

    /**
     * 
     * @param resultadoIndGasNatural
     *     The resultadoIndGasNatural
     */
    public void setResultadoIndGasNatural(String resultadoIndGasNatural) {
        this.resultadoIndGasNatural = resultadoIndGasNatural;
    }

    /**
     * 
     * @return
     *     The resultadoIndMecanismoPromociN
     */
    public String getResultadoIndMecanismoPromocion() {
        return resultadoIndMecanismoPromocion;
    }

    /**
     * 
     * @param resultadoIndMecanismoPromocion
     *     The resultadoIndMecanismoPromoción
     */
    public void setResultadoIndMecanismoPromocion(String resultadoIndMecanismoPromocion) {
        this.resultadoIndMecanismoPromocion = resultadoIndMecanismoPromocion;
    }

    /**
     * 
     * @return
     *     The ubigeo
     */
    public Integer getUbigeo() {
        return ubigeo;
    }

    /**
     * 
     * @param ubigeo
     *     The ubigeo
     */
    public void setUbigeo(Integer ubigeo) {
        this.ubigeo = ubigeo;
    }

}
