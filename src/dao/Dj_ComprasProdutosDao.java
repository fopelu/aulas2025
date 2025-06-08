/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Dj_ComprasProdutos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class Dj_ComprasProdutosDao extends Dj_DaoAbstract{
    public Dj_ComprasProdutosDao(){
        super();
    }

    @Override
    public void insert(Object object) {
        Dj_ComprasProdutos dj_ComprasProdutos = (Dj_ComprasProdutos) object;
        
        try {
            PreparedStatement pst = cnt.prepareStatement("insert into dj_compras_produtos values(?,?,?,?,?)");
            pst.setInt(1, dj_ComprasProdutos.getDj_id_compras_produtos());
            pst.setInt(2, dj_ComprasProdutos.getDj_fkCompras());
            pst.setInt(3, dj_ComprasProdutos.getDj_fkProdutos());
            pst.setInt(4, dj_ComprasProdutos.getDj_quantidade());
            pst.setString(5, dj_ComprasProdutos.getDj_valor_unitario());
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        Dj_ComprasProdutos dj_ComprasProdutos = (Dj_ComprasProdutos) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("update dj_compras set dj_fkCompras=?, dj_fkProdutos=?, dj_quantidade=?, dj_valor_unitario=? where dj_id_compras_produtos=?");
            pst.setInt(5, dj_ComprasProdutos.getDj_id_compras_produtos());
            pst.setInt(1, dj_ComprasProdutos.getDj_fkCompras());
            pst.setInt(2, dj_ComprasProdutos.getDj_fkProdutos());
            pst.setInt(3, dj_ComprasProdutos.getDj_quantidade());
            pst.setString(4, dj_ComprasProdutos.getDj_valor_unitario());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
    }    
    }

    @Override
    public void delete(Object object) {
         Dj_ComprasProdutos dj_ComprasProdutos = (Dj_ComprasProdutos) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("delete from dj_compras_produtos where dj_id_compras_produtos=?");
            pst.setInt(1, dj_ComprasProdutos.getDj_id_compras_produtos());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public Object list(int id) {
         PreparedStatement pst;
        try {
            pst = cnt.prepareStatement("select * from dj_compras_produtos where dj_id_compras_produtos=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                Dj_ComprasProdutos dj_ComprasProdutos = new Dj_ComprasProdutos();
                dj_ComprasProdutos.setDj_id_compras_produtos(rs.getInt("dj_id_compras_produtos") );
                dj_ComprasProdutos.setDj_fkCompras(rs.getInt("dj_fkCompras") );
                dj_ComprasProdutos.setDj_fkProdutos(rs.getInt("dj_fkProdutos") );
                dj_ComprasProdutos.setDj_quantidade(rs.getInt("dj_quantidade") );
                dj_ComprasProdutos.setDj_valor_unitario(rs.getString("dj_valor_unitario") );
                return dj_ComprasProdutos;
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public Object listAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
