/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Dj_Produtos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class Dj_ProdutosDao extends Dj_DaoAbstract{
    
    public Dj_ProdutosDao(){
        super();
    }

    @Override
    public void insert(Object object) {
        Dj_Produtos dj_Produtos = (Dj_Produtos) object;
        
        try {
            PreparedStatement pst = cnt.prepareStatement("insert into dj_produtos values(?,?,?,?,?,?,?)");
            pst.setInt(1, dj_Produtos.getDj_idProdutos());
            pst.setString(2, dj_Produtos.getDj_nome());
            pst.setString(3, dj_Produtos.getDj_preco());
            pst.setString(4, dj_Produtos.getDj_descricao());
            pst.setString(5, dj_Produtos.getDj_avaliacao());
            pst.setString(6, dj_Produtos.getDj_nome_da_flor());
            pst.setString(7, dj_Produtos.getDj_material());
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
         Dj_Produtos dj_Produtos = (Dj_Produtos) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("update dj_produtos set nome=?, preco=?, descricao=?, avaliacao=?, nome_da_flor=?, material=? where dj_idProdutos=?");
            pst.setInt(7, dj_Produtos.getDj_idProdutos());
            pst.setString(1, dj_Produtos.getDj_nome());
            pst.setString(2, dj_Produtos.getDj_preco());
            pst.setString(3, dj_Produtos.getDj_descricao());
            pst.setString(4, dj_Produtos.getDj_avaliacao());          
            pst.setString(5, dj_Produtos.getDj_nome_da_flor());            
            pst.setString(6, dj_Produtos.getDj_material());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
    }    
    }

    @Override
    public void delete(Object object) {
        Dj_Produtos dj_Produtos = (Dj_Produtos) object;
        try {
            PreparedStatement pst = cnt.prepareStatement("delete from dj_produtos where dj_idProdutos=?");
            pst.setInt(1, dj_Produtos.getDj_idProdutos());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Dj_UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public Object list(int id) {
        PreparedStatement pst;
        try {
            pst = cnt.prepareStatement("select * from dj_produtos where dj_idProdutos=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                Dj_Produtos dj_Produtos = new Dj_Produtos();
                dj_Produtos.setDj_idProdutos(rs.getInt("dj_idProdutos") );
                dj_Produtos.setDj_nome(rs.getString("dj_nome") );
                dj_Produtos.setDj_preco(rs.getString("dj_preco") );
                dj_Produtos.setDj_descricao(rs.getString("dj_descricao") );
                dj_Produtos.setDj_avaliacao(rs.getString("dj_avaliacao") );
                dj_Produtos.setDj_nome_da_flor(rs.getString("dj_nome_da_flor") );
                dj_Produtos.setDj_material(rs.getString("dj_material") );
                return dj_Produtos;
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
