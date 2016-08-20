
package com.gmd.projectmvp.data.services.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmpresasInstaladora {

    @SerializedName("idCategoriaInstalacion")
    @Expose
    private Integer idCategoriaInstalacion;
    @SerializedName("idEmpresaInstaladora")
    @Expose
    private Integer idEmpresaInstaladora;
    @SerializedName("nombreEmpresaInstaladora")
    @Expose
    private String nombreEmpresaInstaladora;
    @SerializedName("precioEstimadoInstalacionTipicaEmpresaInstaladora")
    @Expose
    private String precioEstimadoInstalacionTipicaEmpresaInstaladora;
    @SerializedName("tipoPersonaEmpresaInstaladora")
    @Expose
    private String tipoPersonaEmpresaInstaladora;
    @SerializedName("ubigeoEmpresaInstaladora")
    @Expose
    private Integer ubigeoEmpresaInstaladora;

    /**
     * 
     * @return
     *     The idCategoriaInstalacion
     */
    public Integer getIdCategoriaInstalacion() {
        return idCategoriaInstalacion;
    }

    /**
     * 
     * @param idCategoriaInstalacion
     *     The idCategoriaInstalacion
     */
    public void setIdCategoriaInstalacion(Integer idCategoriaInstalacion) {
        this.idCategoriaInstalacion = idCategoriaInstalacion;
    }

    /**
     * 
     * @return
     *     The idEmpresaInstaladora
     */
    public Integer getIdEmpresaInstaladora() {
        return idEmpresaInstaladora;
    }

    /**
     * 
     * @param idEmpresaInstaladora
     *     The idEmpresaInstaladora
     */
    public void setIdEmpresaInstaladora(Integer idEmpresaInstaladora) {
        this.idEmpresaInstaladora = idEmpresaInstaladora;
    }

    /**
     * 
     * @return
     *     The nombreEmpresaInstaladora
     */
    public String getNombreEmpresaInstaladora() {
        return nombreEmpresaInstaladora;
    }

    /**
     * 
     * @param nombreEmpresaInstaladora
     *     The nombreEmpresaInstaladora
     */
    public void setNombreEmpresaInstaladora(String nombreEmpresaInstaladora) {
        this.nombreEmpresaInstaladora = nombreEmpresaInstaladora;
    }

    /**
     * 
     * @return
     *     The precioEstimadoInstalacionTipicaEmpresaInstaladora
     */
    public String getPrecioEstimadoInstalacionTipicaEmpresaInstaladora() {
        return precioEstimadoInstalacionTipicaEmpresaInstaladora;
    }

    /**
     * 
     * @param precioEstimadoInstalacionTipicaEmpresaInstaladora
     *     The precioEstimadoInstalacionTipicaEmpresaInstaladora
     */
    public void setPrecioEstimadoInstalacionTipicaEmpresaInstaladora(String precioEstimadoInstalacionTipicaEmpresaInstaladora) {
        this.precioEstimadoInstalacionTipicaEmpresaInstaladora = precioEstimadoInstalacionTipicaEmpresaInstaladora;
    }

    /**
     * 
     * @return
     *     The tipoPersonaEmpresaInstaladora
     */
    public String getTipoPersonaEmpresaInstaladora() {
        return tipoPersonaEmpresaInstaladora;
    }

    /**
     * 
     * @param tipoPersonaEmpresaInstaladora
     *     The tipoPersonaEmpresaInstaladora
     */
    public void setTipoPersonaEmpresaInstaladora(String tipoPersonaEmpresaInstaladora) {
        this.tipoPersonaEmpresaInstaladora = tipoPersonaEmpresaInstaladora;
    }

    /**
     * 
     * @return
     *     The ubigeoEmpresaInstaladora
     */
    public Integer getUbigeoEmpresaInstaladora() {
        return ubigeoEmpresaInstaladora;
    }

    /**
     * 
     * @param ubigeoEmpresaInstaladora
     *     The ubigeoEmpresaInstaladora
     */
    public void setUbigeoEmpresaInstaladora(Integer ubigeoEmpresaInstaladora) {
        this.ubigeoEmpresaInstaladora = ubigeoEmpresaInstaladora;
    }

}
