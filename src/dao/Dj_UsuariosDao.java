/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Dj_Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class Dj_UsuariosDao extends Dj_DaoAbstract{

    
    public Dj_UsuariosDao(){
        super();
    }

    @Override
    public void insert(Object object) {
        Dj_Usuarios dj_usuarios = (Dj_Usuarios) object;
        
        try {
            PreparedStatement pst = cnt.prepareStatement("insert into dj_usuarios values(?,?,?,?,?,?,?,?)");
            pst.setInt(1, dj_usuarios.getDj_idUsuarios());
            pst.setString(2, dj_usuarios.getDj_nome());
            pst.setString(3, dj_usuarios.getDj_apelido());
            pst.setString(4, dj_usuarios.getDj_cpf());
            pst.setDate(5, null);
            pst.setString(6, dj_usuarios.getDj_senha());
            pst.setInt(7, dj_usuarios.getDj_nivel());
            pst.setString(8, dj_usuarios.getDj_ativo());
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        Dj_Usuarios dj_usuarios = (Dj_Usuarios) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("update dj_usuarios set nome=?, apelido=?, cpf=?, dataNascimento=?, senha=?, nivel=?, ativo =? where dj_idUsuarios=?");
            pst.setInt(8, dj_usuarios.getDj_idUsuarios());
            pst.setString(1, dj_usuarios.getDj_nome());
            pst.setString(2, dj_usuarios.getDj_apelido());
            pst.setString(3, dj_usuarios.getDj_cpf());
            pst.setDate(4, null);//usuarios.getDataNascimento()
            pst.setString(5, dj_usuarios.getDj_senha());//senha            
            pst.setInt(6, dj_usuarios.getDj_nivel());//nivel            
            pst.setString(7, dj_usuarios.getDj_ativo());//ativo
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
    }    
}

    @Override
    public void delete(Object object) {
        Dj_Usuarios dj_usuarios = (Dj_Usuarios) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("delete from dj_usuarios where dj_idUsuarios=?");
            pst.setInt(1, dj_usuarios.getDj_idUsuarios());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }    
}

    @Override
    public Object list(int id) {
        PreparedStatement pst;
        try {
            pst = cnt.prepareStatement("select * from dj_usuarios where dj_idUsuarios=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                Dj_Usuarios dj_usuarios = new Dj_Usuarios();
                dj_usuarios.setDj_idUsuarios(rs.getInt("dj_idUsuarios") );
                dj_usuarios.setDj_nome(rs.getString("dj_nome") );
                dj_usuarios.setDj_apelido(rs.getString("dj_apelido") );
                dj_usuarios.setDj_cpf(rs.getString("dj_cpf") );
                dj_usuarios.setDj_dataNascimento(rs.getDate("dj_dataNascimento") );
                dj_usuarios.setDj_senha(rs.getString("dj_senha") );
                dj_usuarios.setDj_nivel(rs.getInt("dj_nivel") );
                dj_usuarios.setDj_ativo(rs.getString("dj_ativo") );
                return dj_usuarios;
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
