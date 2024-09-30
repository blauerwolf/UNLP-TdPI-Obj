/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

/**
 *
 * @author eardenghi
 */

import PaqueteLectura.*;


public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        // Creo un nuevo estante vacio.
        Estante e = new Estante();
        EstanteDinamico e2 = new EstanteDinamico(25);
        
        // libro a buscar en el estante
        String tituloBuscado;
        Libro libroBuscado;
        
        boolean estaLleno = e.estaLleno();
        boolean estaLleno2  = e2.estaLleno();
        
        int añoEdicion = GeneradorAleatorio.generarInt(300) + 1724; 
        
        // Genero algunos libros
        System.out.println("Estante de 20 espacios");
        while (!estaLleno && añoEdicion != 2024) {
            
            Libro l = new Libro(
                GeneradorAleatorio.generarString(5),
                GeneradorAleatorio.generarString(3),
                añoEdicion,
                new Autor(GeneradorAleatorio.generarString(35)),
                (GeneradorAleatorio.generarInt(1000) + 1) + "-" + GeneradorAleatorio.generarString(10),
                GeneradorAleatorio.generarDouble(1000)
            );
            
            System.out.println(l.toString());
            
            e.agregarLibro(l);
                            
            
            estaLleno = e.estaLleno();
            añoEdicion = GeneradorAleatorio.generarInt(300) + 1724;
        }
        
        System.out.println("Cantidad de libros: " + e.cantidadLibros());
        System.out.println();
        
        // Estante dinámico
        System.out.println("Estante de dinámico");
        while (!estaLleno2 && añoEdicion != 2024) {
            
            Libro l = new Libro(
                GeneradorAleatorio.generarString(5),
                GeneradorAleatorio.generarString(3),
                añoEdicion,
                new Autor(GeneradorAleatorio.generarString(35)),
                (GeneradorAleatorio.generarInt(1000) + 1) + "-" + GeneradorAleatorio.generarString(10),
                GeneradorAleatorio.generarDouble(1000)
            );
            
            System.out.println(l.toString());
            
            e2.agregarLibro(l);
                            
            
            estaLleno2 = e2.estaLleno();
            añoEdicion = GeneradorAleatorio.generarInt(300) + 1724;
        }
        
        System.out.println("Cantidad de libros estante dinamico: " + e2.cantidadLibros());
        
        // Verifico que se haya cargado correctamente el estante.
        //e.verEstante();
        //System.out.println();
        //e2.verEstante();
        
        // Solicito el libro a buscar:
        System.out.print("Ingrese el titulo del libro a buscar: ");
        tituloBuscado = Lector.leerString();
        libroBuscado = e.getLibroByTitle(tituloBuscado);
        System.out.println(libroBuscado != null ? libroBuscado.toString() : "No se encontró el libro.");
        
        // Solicito el libro a buscar:
        System.out.print("Ingrese el titulo del libro a buscar del estante dinámico: ");
        tituloBuscado = Lector.leerString();
        libroBuscado = e2.getLibroByTitle(tituloBuscado);
        System.out.println(libroBuscado != null ? libroBuscado.toString() : "No se encontró el libro.");
        
    }
    
}
