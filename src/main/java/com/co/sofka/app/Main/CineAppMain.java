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
            System.out.println("1. Ingresar nuevo usuario");
            System.out.println("2. Iniciar proceso para rentar Película");
            System.out.println("3. Ingrese nombre de Actor para ver Películas Disponibles");
            System.out.println("5. Salir");

            //Leemos la opción ingresada por el usuario
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    CineAppService.crearUsuario();
                    break;
                case 2:
                    CineAppService.rentarPelicula();
                    break;
                case 3:
                    CineAppService.disponibilidadPelicula();
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }
}
