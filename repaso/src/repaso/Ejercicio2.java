/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */

import PaqueteLectura.*;


public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
    private static String generarPatente() {
        return  GeneradorAleatorio.generarString(2).toUpperCase() +
                GeneradorAleatorio.generarInt(10) +
                GeneradorAleatorio.generarInt(10) +
                GeneradorAleatorio.generarInt(10) +
                GeneradorAleatorio.generarString(2).toUpperCase();
    }
    
    
    private static String generarNombre() {
        String[] nombres = {
            "Marie", "Juan", "Alix", "John", "Sarah", 
            "Carlos", "Mili", "Thor", "Eleonor", "Lara",
            "Galileo", "Cristopher", "Celine", "Gustav", "Jennifer",
            "Pedro Pe", "Isabel", "Lauren", "Charly", "Mariana"
        };
        
        return nombres[GeneradorAleatorio.generarInt(20)];
    }
    
    public static void main(String[] args) {
        Auto a1;
        Estacionamiento e1;
        int X, Y;
        String nombre, dominio;
        int i = 0, j = 0, total = 0;
        
        /*
        // Leo la cantidad de pisos y plazas para inicializar el estacionamiento
        System.out.print("Cantidad de pisos del estacionamiento: ");
        X = Lector.leerInt();
        System.out.print("Cantidad de plazas por piso del estacionamiento: ");
        Y = Lector.leerInt();
        
        e1 = new Estacionamiento("Estacionamiento Grand Plaza", "Belgrano 1812", "08:00", "21:00", X, Y);
        
        // Auto: Carga de datos
        System.out.print("Titular del vehiculo: ");
        nombre = Lector.leerString();
        System.out.print("Dominio del vehiculo: ");
        dominio = Lector.leerString();
        
        a1 = new Auto(nombre, dominio);
        
        // Leemos una posición de piso y plaza (X,Y)
        System.out.print("Ingrese piso asignado: ");
        X = Lector.leerInt();
        System.out.print("Ingrese número de plaza: ");
        Y = Lector.leerInt();
        
        // Asigno al auto en la plaza deseada.
        if (e1.setAutoEnPlaza(a1, Y, Y)) {
            System.out.println("Se asignó el auto a la plaza");
        } else {
            System.out.println("La plaza no está disponible.");
        }
        
        System.out.println(e1.toString());
        */
        
        e1 = new Estacionamiento("Estacionamiento Grand Plaza", "Belgrano 1812", "08:00", "21:00", 3, 3);
        
        // Agrego 6 autos random a lugares random
        nombre = generarNombre();
        dominio = generarPatente();
        
        
        
        while (total < 6) {
            
            // Genero posiciones aleatorias dentro del estacionamiento
            X = GeneradorAleatorio.generarInt(3) + 1;
            Y = GeneradorAleatorio.generarInt(3) + 1;
            
            Auto a = new Auto(nombre, dominio);
            
            if (e1.setAutoEnPlaza(a, X, Y)) {
                
                nombre = generarNombre();
                dominio = generarPatente();
                
                total++;
            }           
        }
        
        // representacón del estacionamiento
        System.out.println(e1.toString());
        
        // cantidad de autos ubicados en la plaza 1:
        System.out.println("Autos estacionados en la Plaza 1: " + e1.getCantidadAutosEnPlaza(1));
        
        //
        System.out.print("Ingrese una patente para buscar: ");
        dominio = Lector.leerString();
        System.out.println(e1.buscarAuto(dominio));
        
        
            
    }
    
}
