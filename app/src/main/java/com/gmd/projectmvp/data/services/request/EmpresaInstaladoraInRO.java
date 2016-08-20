
package com.gmd.projectmvp.data.services.request;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

public class EmpresaInstaladoraInRO {

    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("appInvoker")
    @Expose
    private String appInvoker;
    @SerializedName("tipoPersonaEmpresaInstaladora")
    @Expose
    private String tipoPersonaEmpresaInstaladora;
    @SerializedName("ubigeoEmpresaInstaladora")
    @Expose
    private String ubigeoEmpresaInstaladora;
    @SerializedName("idCategoriaInstalacion")
    @Expose
    private Integer idCategoriaInstalacion;
    @SerializedName("asociadoFiseEmpresaInstaladora")
    @Expose
    private String asociadoFiseEmpresaInstaladora;

    /**
     * 
     * @return
     *     The token
     */
    public String getToken() {
        return token;
    }

    /**
     * 
     * @param token
     *     The token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 
     * @return
     *     The appInvoker
     */
    public String getAppInvoker() {
        return appInvoker;
    }

    /**
     * 
     * @param appInvoker
     *     The appInvoker
     */
    public void setAppInvoker(String appInvoker) {
        this.appInvoker = appInvoker;
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
    public String getUbigeoEmpresaInstaladora() {
        return ubigeoEmpresaInstaladora;
    }

    /**
     * 
     * @param ubigeoEmpresaInstaladora
     *     The ubigeoEmpresaInstaladora
     */
    public void setUbigeoEmpresaInstaladora(String ubigeoEmpresaInstaladora) {
        this.ubigeoEmpresaInstaladora = ubigeoEmpresaInstaladora;
    }

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
     *     The asociadoFiseEmpresaInstaladora
     */
    public String getAsociadoFiseEmpresaInstaladora() {
        return asociadoFiseEmpresaInstaladora;
    }

    /**
     * 
     * @param asociadoFiseEmpresaInstaladora
     *     The asociadoFiseEmpresaInstaladora
     */
    public void setAsociadoFiseEmpresaInstaladora(String asociadoFiseEmpresaInstaladora) {
        this.asociadoFiseEmpresaInstaladora = asociadoFiseEmpresaInstaladora;
    }

    public JSONObject toJSON()  {
        JSONObject object=null;
        try{
            object = new JSONObject();
            JSONObject items = new JSONObject();
            items.put("token",getToken());
            items.put("appInvoker",getAppInvoker());
            items.put("tipoPersonaEmpresaInstaladora",getTipoPersonaEmpresaInstaladora());
            items.put("ubigeoEmpresaInstaladora",getUbigeoEmpresaInstaladora());
            items.put("idCategoriaInstalacion",getIdCategoriaInstalacion());
            items.put("asociadoFiseEmpresaInstaladora",getAsociadoFiseEmpresaInstaladora());

            object.put("empresaInstaladora",items);
        }catch(JSONException e){
            e.printStackTrace();
        }
        return object;
    }

}
