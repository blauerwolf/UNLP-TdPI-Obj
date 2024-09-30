/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

/**
 *
 * @author eardenghi
 */

import PaqueteLectura.Lector;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
    private static Autor cargarAutor() {
        System.out.print("Nombre autor: ");
        String nombre = Lector.leerString();
        
        System.out.print("Biografía: ");
        String biografia = Lector.leerString();
        
        System.out.print("Origen: ");
        String origen = Lector.leerString();
        
        return new Autor(nombre, biografia, origen);
    }
    
    
    public static void main(String[] args) {
        System.out.print("Título: ");
        String titulo = Lector.leerString();
        
        System.out.print("Editorial: ");
        String editorial = Lector.leerString();
        
        System.out.print("Año de edición: ");
        int añoEdicion = Lector.leerInt();
        
        System.out.print("Precio: ");
        double precio = Lector.leerDouble();
        
        System.out.print("ISBN: ");
        String isbn = Lector.leerString();
        
        System.out.println("Datos de autor: ");
        Autor a = cargarAutor();
        
        
        Libro l = new Libro(titulo, editorial, añoEdicion, a, isbn, precio);
        System.out.println(l.toString());
    }
    
}
