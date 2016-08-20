
package com.gmd.projectmvp.data.services.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

public class CoberturaServicioInRO {

    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("coordenadaX")
    @Expose
    private String coordenadaX;
    @SerializedName("coordenadaY")
    @Expose
    private String coordenadaY;
    @SerializedName("cantidadMetros")
    @Expose
    private Integer cantidadMetros;

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
     *     The coordenadaX
     */
    public String getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * 
     * @param coordenadaX
     *     The coordenadaX
     */
    public void setCoordenadaX(String coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * 
     * @return
     *     The coordenadaY
     */
    public String getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * 
     * @param coordenadaY
     *     The coordenadaY
     */
    public void setCoordenadaY(String coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * 
     * @return
     *     The cantidadMetros
     */
    public Integer getCantidadMetros() {
        return cantidadMetros;
    }

    /**
     * 
     * @param cantidadMetros
     *     The cantidadMetros
     */
    public void setCantidadMetros(Integer cantidadMetros) {
        this.cantidadMetros = cantidadMetros;
    }

    public JSONObject toJSON()  {
        JSONObject object=null;
        try{
            object = new JSONObject();
            JSONObject items = new JSONObject();
            items.put("token",getToken());
            items.put("coordenadaX",getCoordenadaX());
            items.put("coordenadaY",getCoordenadaY());
            items.put("cantidadMetros",getCantidadMetros());
            object.put("coberturaServicioGasNatural",items);
        }catch(JSONException e){
            e.printStackTrace();
        }
        return object;
    }

}
