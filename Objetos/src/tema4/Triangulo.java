/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author dunkelwolf
 */
public class Triangulo extends Figura {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    
    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }
    
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    public Triangulo(double unLadoA, double unLadoB, double unLadoC, String unColorRelleno, String unColorLinea) {
        super(unColorRelleno, unColorLinea);
        this.setLadoA(unLadoA);
        this.setLadoB(unLadoB);
        this.setLadoC(unLadoC);
        
    }
    
    public double calcularArea() {
        // Utilizando la fórmula de Herón:
        double s = (ladoA + ladoB + ladoC) / 2;
        double A = Math.sqrt(s*(s - ladoA) * (s - ladoB) * (s - ladoC));
        return A;
    } 
    
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
    

    public String toString() {
        String aux = super.toString() + "\n" +
                    "Lado A: " + getLadoA() + "\n" +
                    "Lado B: " + getLadoB() + "\n" +
                    "Lado C: " + getLadoC() + "\n";
                    
        return aux;
                
    }
    
}
