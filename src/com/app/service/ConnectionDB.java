package com.app.service;

import java.sql.*;

public class ConnectionDB {

	Connection conn = null;

    public Connection GetDB() {

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/comanda";
            String user = "sa";
            String pass = "2468";
            
            conn = DriverManager.getConnection(url, user, pass);

            //System.out.println("Sucesso!");
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return conn;
    }
    
    public static void main(String[] args) {
        new ConnectionDB().GetDB();
    }
	
}
