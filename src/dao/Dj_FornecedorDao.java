/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Dj_Fornecedor;
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
public class Dj_FornecedorDao extends Dj_DaoAbstract{
    
    public Dj_FornecedorDao(){
        super();
    }

    @Override
    public void insert(Object object) {
        Dj_Fornecedor dj_Fornecedor = (Dj_Fornecedor) object;
        
        try {
            PreparedStatement pst = cnt.prepareStatement("insert into dj_fornecedor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, dj_Fornecedor.getDj_idFornecedor());
            pst.setString(2, dj_Fornecedor.getDj_nome());
            pst.setString(3, dj_Fornecedor.getDj_cnpj());
            pst.setString(4, dj_Fornecedor.getDj_rg());
            pst.setDate(5, null);
            pst.setString(6, dj_Fornecedor.getDj_email());
            pst.setString(7, dj_Fornecedor.getDj_telefone());
            pst.setString(8, dj_Fornecedor.getDj_endereco());
            pst.setString(9, dj_Fornecedor.getDj_cidade());
            pst.setString(10, dj_Fornecedor.getDj_bairro());
            pst.setString(11, dj_Fornecedor.getDj_cep());
            pst.setString(12, dj_Fornecedor.getDj_pais());
            pst.setString(13, dj_Fornecedor.getDj_estado());
            pst.setString(14, dj_Fornecedor.getDj_nomeSite());
            pst.setDate(15, null);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        Dj_Fornecedor dj_Fornecedor = (Dj_Fornecedor) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("update dj_fornecedor set nome=?, cnpj=?, rg=?, datanascimento=?, email=?, telefone=?, endereco=?, cidade=?, bairro=?, cep=?, pais=?, estado=?, nomesite=?, dateCadastro=? where dj_idFornecedor=?");
            pst.setInt(15, dj_Fornecedor.getDj_idFornecedor());
            pst.setString(1, dj_Fornecedor.getDj_nome());
            pst.setString(2, dj_Fornecedor.getDj_cnpj());
            pst.setString(3, dj_Fornecedor.getDj_rg());
            pst.setDate(4, null);
            pst.setString(5, dj_Fornecedor.getDj_email());
            pst.setString(6, dj_Fornecedor.getDj_telefone());
            pst.setString(7, dj_Fornecedor.getDj_endereco());
            pst.setString(8, dj_Fornecedor.getDj_cidade());
            pst.setString(9, dj_Fornecedor.getDj_bairro());
            pst.setString(10, dj_Fornecedor.getDj_cep());
            pst.setString(11, dj_Fornecedor.getDj_pais());
            pst.setString(12, dj_Fornecedor.getDj_estado());
            pst.setString(13, dj_Fornecedor.getDj_nomeSite());
            pst.setDate(14, null);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Dj_FornecedorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
            Dj_Fornecedor dj_Fornecedor = (Dj_Fornecedor) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("delete from dj_fornecedor where dj_idFornecedor=?");
            pst.setInt(1, dj_Fornecedor.getDj_idFornecedor());
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dj_FornecedorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object list(int id) {
        PreparedStatement pst;
        try {
            pst = cnt.prepareStatement("select * from dj_fornecedor where dj_idFornecedor=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                Dj_Fornecedor dj_Fornecedor = new Dj_Fornecedor();
                dj_Fornecedor.setDj_idFornecedor(rs.getInt("dj_idFornecedor") );
                dj_Fornecedor.setDj_nome(rs.getString("dj_nome") );
                dj_Fornecedor.setDj_cnpj(rs.getString("dj_cnpj") );
                dj_Fornecedor.setDj_rg(rs.getString("dj_rg") );
                dj_Fornecedor.setDj_dataNascimento(rs.getDate("dj_dataNascimento") );
                dj_Fornecedor.setDj_email(rs.getString("dj_email") );
                dj_Fornecedor.setDj_telefone(rs.getString("dj_telefone") );
                dj_Fornecedor.setDj_endereco(rs.getString("dj_endereco") );
                dj_Fornecedor.setDj_cidade(rs.getString("dj_cidade") );
                dj_Fornecedor.setDj_bairro(rs.getString("dj_bairro") );
                dj_Fornecedor.setDj_cep(rs.getString("dj_cep") );
                dj_Fornecedor.setDj_pais(rs.getString("dj_pais") );
                dj_Fornecedor.setDj_estado(rs.getString("dj_estado") );
                dj_Fornecedor.setDj_nomeSite(rs.getString("dj_nomeSite") );
                dj_Fornecedor.setDj_dataCadastro(rs.getDate("dj_dataCadastro") );
                return dj_Fornecedor;
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
