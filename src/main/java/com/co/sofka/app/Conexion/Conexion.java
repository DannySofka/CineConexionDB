package com.co.sofka.app.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection connection;

    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com:3306/DannyAreiza", "sofka_training", "BZenX643bQHw");

        }catch (SQLException e){
            System.out.println(e);

        }
        return connection;
    }
    public Connection closeConnection(){

        try {
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

}


