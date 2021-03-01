package com.co.sofka.app.Main;

import com.co.sofka.app.Conexion.CineAppService;

import java.util.Scanner;

public class CineAppMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("---------------------");
            System.out.println(" Aplicación para proceso de renta de Películas ");
            System.out.println("1. Crear");
            System.out.println("2. listar");
            System.out.println("3. Salir");

            //Leemos la opción ingresada por el usuario
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    CineAppService.crear();
                    break;
                case 2:
                    CineAppService.listar();
                    break;
                default:
                    break;
            }
        } while (opcion != 3);
    }
}
