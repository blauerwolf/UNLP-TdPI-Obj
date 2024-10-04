/*
    1- Nos piden una aplicación estilo Paint, para ello necesitamos representar figuras
    geométricas (cuadrados, rectángulos, círculos, triángulos). Todas las figuras tienen color
    de relleno y color de línea. Además, los triángulos guardan el valor de sus tres lados, los
    cuadrados el valor de su lado, los círculos el valor del radio, y los rectángulos el valor de la
    base y de la altura.

    Las figuras deben incluir funcionalidad para: crearla a partir de los datos necesarios
    (constructor), modificar/obtener el valor de los atributos (métodos get y set), calcular el
    área y devolverla (método calcularArea), calcular el perimetro y devolverlo (método
    calcularPerimetro), y mostrar la representación String de la figura (método toString)
    concatenando toda la información.
 */
package tema4;

/**
 *
 * @author dunkelwolf
 */

import PaqueteLectura.Lector;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c;
        Triangulo t;
        double radio, ladoA, ladoB, ladoC;
        String rellenoC, lineaC, rellenoT, lineaT;
        
        System.out.print("Ingrese el radio del Circulo");
        radio = Lector.leerDouble();
        
        System.out.print("Ingrese color de relleno del círculo: ");
        rellenoC = Lector.leerString();
        
        System.out.print("Ingrese el color de línea del círculo: ");
        lineaC = Lector.leerString();
        
        c = new Circulo(radio, rellenoC, lineaC);
        System.out.println(c.toString());
        
        c.despintar();
        System.out.println(c.toString());
        
        System.out.print("Ingrese la dimensión del Lado A del triángulo: ");
        ladoA = Lector.leerDouble();
        
        System.out.print("Ingrese la dimensión del Lado B del triángulo: ");
        ladoB = Lector.leerDouble();
        
        System.out.print("Ingrese la dimensión del Lado C del triángulo: ");
        ladoC = Lector.leerDouble();
        
        System.out.print("Ingrese color de relleno del triángulo: ");
        rellenoT = Lector.leerString();
        
        System.out.print("Ingrese el color de línea del triángulo: ");
        lineaT = Lector.leerString();
        
        t = new Triangulo(ladoA, ladoB, ladoC, rellenoT, lineaT);
        System.out.println(t.toString());
        t.despintar();
        System.out.println(t.toString());
        

    }
    
}
