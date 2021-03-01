package com.co.sofka.app.Conexion;

import com.co.sofka.app.Modelo.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CineAppDAO {

    public static void crear(Category category) {
        Conexion dbConnect = new Conexion();
        ResultSet rs = null;

        try (Connection conexion = dbConnect.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO category(name) VALUES(?)";
                ps = conexion.prepareStatement(query);
                ps.executeUpdate();
                System.out.println("Categoria ingresada correctamente");

            } catch (SQLException e) {
                System.out.println(e);

            }

        } catch (SQLException e) {
            System.out.println(e);

        }

    }

    public static void leer() {
        Category ct = new Category();
        Conexion dbConnect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection conexion = dbConnect.getConnection()) {
            String query = "SELECT * FROM category";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                ct.setId(rs.getInt("category_id"));
                ct.getCategoryName();

                System.out.println("ID: " + rs.getInt("category_id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("");

            }
        } catch (SQLException e) {
            System.out.println("No fue posible recuperar los datos");
        }
    }


}
