/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exypnos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Afif Raihan
 */
public class Database {
    private Connection con;
    private Statement stmt = null;
    private ResultSet rs = null;

     public void connect(){
        try {
            String url = "jdbc:mysql://localhost:3306/exypnos";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void addSiswa(Siswa s){
    try {
            String query = "insert into siswa values ('" + s.getIdSiswa()+ "','" + s.getNamaSiswa()+ "','" + s.getTahunMasuk()+ "','" + s.getJurusan()+ "');";
            Statement state = con.createStatement();
            state.execute(query);
            System.out.println("Saving Success.");
        } catch (SQLException se) {
            System.out.println("Saving Error");
        }
    
}
    
    
    
    
}

