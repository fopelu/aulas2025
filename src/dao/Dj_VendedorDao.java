/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Dj_Vendedor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author danie
 */
public class Dj_VendedorDao extends Dj_DaoAbstract {
    public Dj_VendedorDao(){
        super();
    }

    @Override
    public void insert(Object object) {
        Dj_Vendedor dj_Vendedor = (Dj_Vendedor) object;
        
        try {
            PreparedStatement pst = cnt.prepareStatement("insert into dj_vendedor values(?,?,?,?,?,?,?)");
            pst.setInt(1, dj_Vendedor.getDj_idVendedor());
            pst.setString(2, dj_Vendedor.getDj_nome());
            pst.setString(3, dj_Vendedor.getDj_cpf());
            pst.setString(4, dj_Vendedor.getDj_telefone());
            pst.setString(5, dj_Vendedor.getDj_email());
            pst.setString(6, dj_Vendedor.getDj_endereco());
            pst.setString(7, dj_Vendedor.getDj_cep());
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        Dj_Vendedor dj_Vendedor = (Dj_Vendedor) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("update dj_vendedor set nome=?, cpf=?, telefone=?, email=?, endereco=?, cep=? where dj_idVendedor=?");
            pst.setInt(7, dj_Vendedor.getDj_idVendedor());
            pst.setString(1, dj_Vendedor.getDj_nome());
            pst.setString(2, dj_Vendedor.getDj_cpf());
            pst.setString(3, dj_Vendedor.getDj_telefone());
            pst.setString(4, dj_Vendedor.getDj_email());
            pst.setString(5, dj_Vendedor.getDj_endereco());
            pst.setString(6, dj_Vendedor.getDj_cep());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
    }    
    }

    @Override
    public void delete(Object object) {
         Dj_Vendedor dj_Vendedor = (Dj_Vendedor) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("delete from dj_vendedor where dj_idVendedor=?");
            pst.setInt(1, dj_Vendedor.getDj_idVendedor());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    @Override
    public Object list(int id) {
        PreparedStatement pst;
        try {
            pst = cnt.prepareStatement("select * from dj_vendedor where dj_idVendedor=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                Dj_Vendedor dj_Vendedor = new Dj_Vendedor();
                dj_Vendedor.setDj_idVendedor(rs.getInt("dj_idVendedor") );
                dj_Vendedor.setDj_nome(rs.getString("dj_nome") );
                dj_Vendedor.setDj_cpf(rs.getString("dj_cpf") );
                dj_Vendedor.setDj_telefone(rs.getString("dj_telefone") );
                dj_Vendedor.setDj_email(rs.getString("dj_email") );
                dj_Vendedor.setDj_endereco(rs.getString("dj_endereco") );
                dj_Vendedor.setDj_cep(rs.getString("dj_cep") );
                return dj_Vendedor;
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
