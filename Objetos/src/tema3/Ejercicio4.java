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

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int N;      // Número de habitaciones del hotel
        Hotel h;    // hotel
        
        Cliente c;  // El cliente a agregar
        int dni, edad, nroHabitacion, i;
        String nombre;
        double aumento;
        
        System.out.print("Ingrese la cantidad de habitaciones para el nuevo Hotel: ");
        N = Lector.leerInt();
        
        h = new Hotel(N);
        
        /*
        System.out.println("Ingrese datos del cliente");
        System.out.print("DNI: ");
        dni = Lector.leerInt();
        
        System.out.print("Nombre: ");
        nombre = Lector.leerString();
        
        System.out.print("Edad: ");
        edad = Lector.leerInt();
        
        System.out.print("Habitacion: ");
        nroHabitacion = Lector.leerInt();
        */
        
        System.out.println(h.toString());
        
        i = 0;
        dni = GeneradorAleatorio.generarInt(1000);
        while (i < N && dni != 666) {
            
            nombre = GeneradorAleatorio.generarString(35);
            edad = GeneradorAleatorio.generarInt(120);
            nroHabitacion = GeneradorAleatorio.generarInt(N);
            
            c = new Cliente(dni, nombre, edad);
            h.setClienteToHabitacion(c, nroHabitacion);
              
            dni = GeneradorAleatorio.generarInt(1000);
            i++;
        }
        

        if (i == N) {
            if (dni == 666) {
                System.out.println("<<Nuestro último huésped tiene dni 666>>\n");
            } else {
                System.out.println("<<No hay más habitaciones disponibles>>\n");
            }
        } else {
            if (dni == 666) {
                System.out.println("<<Arribó nuestro último huésped>>\n");
            }
        }
        
        System.out.println(h.toString());
        
        
        /*
        c = new Cliente(dni, nombre, edad);
        System.out.println(c.toString());
        
        h.setClienteToHabitacion(c, nroHabitacion);
        System.out.println(h.toString());
        */
        
        System.out.print("Ingrese el monto para la inflacionación: ");
        aumento = Lector.leerDouble();
        
        h.setInflacionarPrecios((float) aumento);
        
        //System.out.println(h.getCantidadHabitaciones());
        System.out.println(h.toString());
        
    }
    
}
