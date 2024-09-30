/*
    Realizar un programa que instancie un triángulo, le cargue información leída desde
    teclado e informe en consola el perímetro y el área.
 */
package tema3;

/**
 *
 * @author eardenghi
 */

import PaqueteLectura.Lector;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Ingresar lado 1: ");
        double l1 = Lector.leerDouble();
        
        System.out.print("Ingresar lado 2: ");
        double l2 = Lector.leerDouble();
        
        System.out.print("Ingresar lado 3: ");
        double l3 = Lector.leerDouble();
        
        System.out.print("Ingresar color de relleno: ");
        String relleno = Lector.leerString();
        
        System.out.print("Ingresar color de línea: ");
        String linea = Lector.leerString();
        
        Triangulo t = new Triangulo(l1, l2, l3, relleno, linea);
        System.out.println(t.toString());
        System.out.println();
        
        System.out.println("Perímetro: " + String.format("%.2f", t.calcularPerimetro()));
        
        System.out.println("Área: " + String.format("%.2f", t.calcularArea()));
    }
}
