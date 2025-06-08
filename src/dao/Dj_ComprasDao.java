/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Dj_Compras;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author danie
 */
public class Dj_ComprasDao extends Dj_DaoAbstract{
    public Dj_ComprasDao(){
        super();
    }

    @Override
    public void insert(Object object) {
        Dj_Compras dj_Compras = (Dj_Compras) object;
        
        try {
            PreparedStatement pst = cnt.prepareStatement("insert into dj_compras values(?,?,?,?,?)");
            pst.setInt(1, dj_Compras.getDj_idCompras());
            pst.setDate(2, null);
            pst.setInt(3, dj_Compras.getDj_fkFornecedor());
            pst.setInt(4, dj_Compras.getDj_fkUsuario());
            pst.setString(5, dj_Compras.getDj_total());
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        Dj_Compras dj_Compras = (Dj_Compras) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("update dj_compras set dj_dataCompras=?, dj_fkFornecedor=?, dj_fkUsuario=?, dj_total=? where dj_idCompras=?");
            pst.setInt(5, dj_Compras.getDj_idCompras());
            pst.setDate(1, null);
            pst.setInt(2, dj_Compras.getDj_fkFornecedor());
            pst.setInt(3, dj_Compras.getDj_fkUsuario());
            pst.setString(4, dj_Compras.getDj_total());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
    }    
    }

    @Override
    public void delete(Object object) {
        Dj_Compras dj_Compras = (Dj_Compras) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("delete from dj_compras where dj_idCompras=?");
            pst.setInt(1, dj_Compras.getDj_idCompras());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public Object list(int id) {
        PreparedStatement pst;
        try {
            pst = cnt.prepareStatement("select * from dj_compras where dj_idCompras=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                Dj_Compras dj_Compras = new Dj_Compras();
                dj_Compras.setDj_idCompras(rs.getInt("dj_idCompras") );
                dj_Compras.setDj_dataCompras(rs.getDate("dj_dataCompras") );
                dj_Compras.setDj_fkFornecedor(rs.getInt("dj_fkFornecedor") );
                dj_Compras.setDj_fkUsuario(rs.getInt("dj_fkUsuario") );
                dj_Compras.setDj_total(rs.getString("dj_total") );
                return dj_Compras;
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
