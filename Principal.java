package com.liceolapaz.des.acc;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Escribir menú.
        escribirMenu();
        //Pedir opción.
        pedirOpcion();
        //Leer opción y guardarla.
        int opcion= leerOpcion();
        //
        switch (opcion){
            case 0:
                System.out.println("Hasta la próxima.");
                System.exit(0);
                break;
            case 1:
                int numeroIntentos = 0;
                int maximoIntentos= 3;
                int numeroAleatorio = 0;
                numeroAleatorio = generarNumeroAleatorio(1,10);
                //Escribir el número aleatorio generado
                System.out.println("El número aleatorio generado es "+ numeroAleatorio);
                int numeroUsuario = 0;
                while (numeroIntentos < maximoIntentos ) {

                    //pedir al usuario un numero y que coincida con el numero aleatorio
                    pedirNumeroUsuario();
                    //leer y guardar numero usuario
                    numeroUsuario= pedirAleatorio();
                    //Sumar un intento
                    numeroIntentos++;
                    if(numeroAleatorio==numeroUsuario){
                        System.out.println("has acertado en el intento " + numeroIntentos);
                        break;
                    }//si no encontramos el número
                    else if (numeroAleatorio >  numeroUsuario){
                        System.out.println("el número es mayor");
                    } else if (numeroAleatorio < numeroUsuario) {
                        System.out.println("el número es menor");
                    }
                }
                if (numeroAleatorio != numeroUsuario) {
                    System.out.println("Acabaste el número de intentos y el numero era " + numeroAleatorio);
                    break;
                }

                break;
            case 2:
                int numeroIntentos2 = 0;
                int maximoIntentos2= 5;
                int numeroAleatorio2= 0;
                numeroAleatorio2 = generarNumeroAleatorio(1,50);
                //Escribir el número aleatorio generado
                System.out.println("El número aleatorio generado es "+ numeroAleatorio2);
                int numeroUsuario2 = 0;
                while (numeroIntentos2 < maximoIntentos2 ) {

                    //pedir al usuario un numero y que coincida con el numero aleatorio
                    pedirNumeroUsuario();
                    //leer y guardar numero usuario
                    numeroUsuario2= pedirAleatorio();
                    //Sumar un intento
                    numeroIntentos2++;
                    if(numeroAleatorio2==numeroUsuario2){
                        System.out.println("has acertado en el intento " + numeroIntentos2);
                        break;
                    }//si no encontramos el número
                    else if (numeroAleatorio2 >  numeroUsuario2){
                        System.out.println("el número es mayor");
                    } else if (numeroAleatorio2 < numeroUsuario2) {
                        System.out.println("el número es menor");
                    }
                }
                if (numeroAleatorio2 != numeroUsuario2) {
                    System.out.println("Acabaste el número de intentos y el numero era " + numeroAleatorio2);
                    break;
                }

                break;

            default:
                System.out.println("Opción no válida");
        }
    }

    private static int pedirAleatorio() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max-min ) + min;
    }

    private static void pedirNumeroUsuario() {
        System.out.println("Escriba un número:");
    }

    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escribe una opción: ");
    }

    private static void escribirMenu() {
        System.out.println("MENÚ OPCIONES\n"+
                "1. Del 1 al 10\n"+
                "2. Del 1 al 50\n"+
                "0. Salir");
    }
}
