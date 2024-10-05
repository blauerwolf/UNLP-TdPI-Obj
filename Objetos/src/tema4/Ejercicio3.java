/*
    3-A- Implemente las clases para el siguiente problema. Una garita de seguridad quiere
    identificar los distintos tipos de personas que entran a un barrio cerrado. Al barrio pueden
    entrar: personas, que se caracterizan por nombre, DNI y edad; y trabajadores, estos son
    personas que se caracterizan además por la tarea realizada en el predio.
    Implemente constructores, getters y setters para las clases. Además tanto las personas
    como los trabajadores deben responder al mensaje toString siguiendo el formato:

    * Personas
    “Mi nombre es Mauro, mi DNI es 11203737 y tengo 70 años”

    * Trabajadores “Mi nombre es Mauro, mi DNI es 11203737 y tengo 70 años. Soy
    jardinero.”

    B- Realice un programa que instancie una persona y un trabajador y muestre la
    representación de cada uno en consola.
    NOTA: Reutilice la clase Persona (carpeta tema2).
 */
package tema4;

/**
 *
 * @author dunkelwolf
 */

import PaqueteLectura.Lector;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p;
        Trabajador t;
        
        String nombre, tarea;
        int dni, edad;
        
        System.out.println("Información del vecinirijillo del country");
        System.out.println("-----------------------------------------");                
        System.out.print("Ingrese nombre: ");
        nombre = Lector.leerString();
        System.out.print("Ingrese DNI: ");
        dni = Lector.leerInt();
        System.out.print("Ingrese edad: ");
        edad = Lector.leerInt();
        
        p = new Persona(nombre, dni, edad);
        System.out.println(p.toString());
        
        System.out.println("Información del Trabajador del country");
        System.out.println("-----------------------------------------");   
        System.out.print("Ingrese nombre: ");
        nombre = Lector.leerString();
        System.out.print("Ingrese DNI: ");
        dni = Lector.leerInt();
        System.out.print("Ingrese edad: ");
        edad = Lector.leerInt();
        System.out.print("Ingrese la tarea del trabajador: ");
        tarea = Lector.leerString();
        
        t = new Trabajador(tarea, nombre, dni, edad);
        System.out.println(t.toString());
        
        
        
    }
    
}
