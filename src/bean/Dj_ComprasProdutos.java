/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author danie
 */
public class Dj_ComprasProdutos {
    private int dj_id_compras_produtos;
    private int dj_fkCompras;
    private int dj_fkProdutos;
    private int dj_quantidade;
    private String dj_valor_unitario;

    public int getDj_id_compras_produtos() {
        return dj_id_compras_produtos;
    }

    public void setDj_id_compras_produtos(int dj_id_compras_produtos) {
        this.dj_id_compras_produtos = dj_id_compras_produtos;
    }

    public int getDj_fkCompras() {
        return dj_fkCompras;
    }

    public void setDj_fkCompras(int dj_fkCompras) {
        this.dj_fkCompras = dj_fkCompras;
    }

    public int getDj_fkProdutos() {
        return dj_fkProdutos;
    }

    public void setDj_fkProdutos(int dj_fkProdutos) {
        this.dj_fkProdutos = dj_fkProdutos;
    }

    public int getDj_quantidade() {
        return dj_quantidade;
    }

    public void setDj_quantidade(int dj_quantidade) {
        this.dj_quantidade = dj_quantidade;
    }

    public String getDj_valor_unitario() {
        return dj_valor_unitario;
    }

    public void setDj_valor_unitario(String dj_valor_unitario) {
        this.dj_valor_unitario = dj_valor_unitario;
    }
}
