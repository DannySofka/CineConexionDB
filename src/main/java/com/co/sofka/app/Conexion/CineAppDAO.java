package com.co.sofka.app.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CineAppDAO {

    public static void crearUsuario(Usuario usuario) {
        Conexion dbConnect = new Conexion();

        try(Connection conexion = dbConnect.getConnection()) {
            PreparedStatement ps = null;
            try() {

            }catch (){
                
            }

        }catch (SQLException e){
            System.out.println(e);

        }

    }

    public static void rentarPelicula() {

    }

    public static void disponibilidadPelicula() {

    }

}
