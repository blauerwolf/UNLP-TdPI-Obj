/*
    Definir una clase para representar triángulos. Un triángulo se caracteriza por el
    tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
    Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
    Provea métodos para:
    -
    -
    -
    Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
    Calcular el perímetro y devolverlo (método calcularPerimetro)
    Calcular el área y devolverla (método calcularArea)
 */
package tema3;

/**
 *
 * @author eardenghi
 */


public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String relleno;
    private String linea;
    
    public Triangulo(double lado1, double lado2, double lado3, String relleno, String linea) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.relleno = relleno;
        this.linea = linea;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public String getRelleno() {
        return relleno;
    }

    public String getLinea() {
        return linea;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
    
    
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    public double calcularArea() {
        // Utilizando la fórmula de Herón:
        double s = (lado1 + lado2 + lado3) / 2;
        double A = Math.sqrt(s*(s - lado1) * (s - lado2) * (s - lado3));
        return A;
    } 
    

    public String toString() {
        String retorno = "Lado 1: " + lado1 + "\n";
        retorno += "Lado 2: " + lado2 + "\n";
        retorno += "Lado 3: " + lado3 + "\n";
        retorno += "Perímetro: " + calcularPerimetro() + "\n";
        retorno += "Área: " + String.format("%.2f", calcularArea()) + "\n";
        return retorno;
                
    }
}
