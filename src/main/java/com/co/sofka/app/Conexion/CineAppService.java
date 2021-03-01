package com.co.sofka.app.Conexion;

import com.co.sofka.app.Modelo.Category;

import java.util.Scanner;

public class CineAppService {

    public static void crear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre de la categoria");
        String cat = sc.nextLine();
        Category category = new Category();
        category.setCategoryName(cat);
        CineAppDAO.crear(category);

    }

    public static void leer() {

    }

    public static void listar() {
        CineAppDAO.leer();

    }
}
