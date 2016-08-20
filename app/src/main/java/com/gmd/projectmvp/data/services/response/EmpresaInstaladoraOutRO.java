
package com.gmd.projectmvp.data.services.response;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmpresaInstaladoraOutRO {

    @SerializedName("resultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("empresasInstaladoras")
    @Expose
    private List<EmpresasInstaladora> empresasInstaladoras = new ArrayList<EmpresasInstaladora>();

    /**
     * 
     * @return
     *     The resultCode
     */
    public Integer getResultCode() {
        return resultCode;
    }

    /**
     * 
     * @param resultCode
     *     The resultCode
     */
    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * 
     * @return
     *     The empresasInstaladoras
     */
    public List<EmpresasInstaladora> getEmpresasInstaladoras() {
        return empresasInstaladoras;
    }

    /**
     * 
     * @param empresasInstaladoras
     *     The empresasInstaladoras
     */
    public void setEmpresasInstaladoras(List<EmpresasInstaladora> empresasInstaladoras) {
        this.empresasInstaladoras = empresasInstaladoras;
    }

}
