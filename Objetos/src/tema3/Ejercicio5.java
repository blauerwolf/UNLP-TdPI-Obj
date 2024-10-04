/*
    B- Realizar un programa que instancie un círculo, le cargue información leída de teclado e
    informe en consola el perímetro y el área.
    NOTA: la constante PI es Math.PI
 */
package tema3;

/**
 *
 * @author dunkelwolf
 */

import PaqueteLectura.Lector;

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c;
        double radio;
        String relleno, linea;
        
        System.out.print("Ingrese un radio para el circulo: ");
        radio = Lector.leerDouble();
        
        System.out.print("Ingrese un color de relleno: ");
        relleno = Lector.leerString();
        
        System.out.print("Ingrese un color de línea: ");
        linea = Lector.leerString();
        
        c = new Circulo(radio, relleno, linea);
        
        // Informo:
        System.out.println("El perimetro del círculo es: " + String.format("%.2f", c.calcularPerimetro()));
        System.out.println("El área del círculo es: " + String.format("%.2f", c.calcularArea()));
        
    }
    
}
