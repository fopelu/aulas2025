/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author danie
 */
public class Dj_Compras {
    private int dj_idCompras;
    private Date dj_dataCompras;
    private int dj_fkFornecedor;
    private int dj_fkUsuario;
    private String dj_total;

    public int getDj_idCompras() {
        return dj_idCompras;
    }

    public void setDj_idCompras(int dj_idCompras) {
        this.dj_idCompras = dj_idCompras;
    }

    public Date getDj_dataCompras() {
        return dj_dataCompras;
    }

    public void setDj_dataCompras(Date dj_dataCompras) {
        this.dj_dataCompras = dj_dataCompras;
    }

    public int getDj_fkFornecedor() {
        return dj_fkFornecedor;
    }

    public void setDj_fkFornecedor(int dj_fkFornecedor) {
        this.dj_fkFornecedor = dj_fkFornecedor;
    }

    public int getDj_fkUsuario() {
        return dj_fkUsuario;
    }

    public void setDj_fkUsuario(int dj_fkUsuario) {
        this.dj_fkUsuario = dj_fkUsuario;
    }

    public String getDj_total() {
        return dj_total;
    }

    public void setDj_total(String dj_total) {
        this.dj_total = dj_total;
    }
}
