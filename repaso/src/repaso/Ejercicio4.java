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

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CoroSemicircular cs;
        CoroPorHileras ch;
        
        String nombreCoro1 = "Coro del Teatro Colón";
        String nombreCoro2 = "Coro del Teatro Argentino";
        
        String[] nombres = {
            "Marie", "Juan", "Alix", "John", "Sarah", 
            "Carlos", "Mili", "Thor", "Eleonor", "Lara",
            "Galileo", "Cristopher", "Celine", "Gustav", "Jennifer",
            "Pedro Pe", "Isabel", "Lauren", "Charly", "Mariana",
            "Vivian", "Sabrina", "Adrian", "Chung Li", "Gala"
        };
        
        Director director1 = new Director("Antonio Lucio Vivaldi", 334456, 62, 40);
        Director director2 = new Director("Wolfgang Amadeus Mozart", 334455, 54, 52);
                
        cs = new CoroSemicircular(nombreCoro1, director1, 25);
        ch = new CoroPorHileras(nombreCoro2, director2, 5, 5);
        
        // Carga de coristas.
        GeneradorAleatorio.iniciar();
        
        for (int i = 0; i < 25; i++) {
            cs.agregarCorista(new Corista(
                    // Nombre aleatorio de la lista de nombres
                    nombres[GeneradorAleatorio.generarInt(25)],
                    
                    // DNI aleatorio
                    GeneradorAleatorio.generarInt(10000),
                    
                    // Edad aleatoria
                    GeneradorAleatorio.generarInt(80) + 10,
                                       
                    // Tono del corista entre 82 y 1046 Hz (sin distinguir hombre/mujer)
                    GeneradorAleatorio.generarInt(964) + 82                    
                )
            );
            
            ch.agregarCorista(new Corista(
                    // Nombre aleatorio de la lista de nombres
                    nombres[GeneradorAleatorio.generarInt(25)],                                    

                    
                    // DNI aleatorio
                    GeneradorAleatorio.generarInt(10000),
                    
                    // Edad aleatoria
                    GeneradorAleatorio.generarInt(80) + 10,
                                                           
                    // Tono del corista entre 82 y 1046 Hz (sin distinguir hombre/mujer)
                    GeneradorAleatorio.generarInt(964) + 82                    
                )
            );
        }
        
        System.out.println(cs.toString());
        System.out.println("El coro " + (cs.estaBienFormado() ? "ESTÁ" : "NO ESTÁ") + " bien formado.");
        System.out.println();
        
        System.out.println(ch.toString());
        System.out.println("El coro " + (ch.estaBienFormado() ? "ESTÁ" : "NO ESTÁ") + " bien formado.");
        System.out.println();
        
        
    }
    
}
