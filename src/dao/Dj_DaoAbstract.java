/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author danie
 */
public abstract class Dj_DaoAbstract {
    
    public Connection cnt;

    public Dj_DaoAbstract() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/dj_sistemadevendasperfume_daniel?serverTimezone=America/Sao_Paulo";
            String user = "root";
            String pass = "yb253286";
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://10.7.0.51:33062/dj_sistemadevendasperfume_daniel?serverTimezone=America/Sao_Paulo";
//            String user = "daniel_jin";
//            String pass = "daniel_jin";
            cnt = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Dj_DaoAbstract.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public abstract void insert(Object object);
    public abstract void update(Object object);
    public abstract void delete(Object object);
    public abstract Object list(int id);
    public abstract Object listAll();
}
