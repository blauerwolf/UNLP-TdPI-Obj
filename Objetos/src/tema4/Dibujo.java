/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author dunkelwolf
 */
public class Dibujo {
    private String titulo;
    private Figura [] vector;
    private int guardadas;
    private int capacidadMaxima = 10;
    
    // inicia el dibujo sin figuras
    public Dibujo (String titulo) {
        this.titulo = titulo;
        this.guardadas = 0;
        vector = new Figura[capacidadMaxima];
    }
    
    
    // agrega la figura al dibujo
    public void agregar(Figura f) {
        // completar
        if (guardadas < capacidadMaxima) {
            vector[guardadas] = f;
            guardadas++;
            
            System.out.println("la figura: { " + f.toString() + " } se ha guardado.");
        } else {
            System.out.println("la figura { " + f.toString() + " } no se pudo guardar");
        }
        
        
    }
    
    
    // calcula el área del dibujo, suma de las áreas de sus figuras.
    public double calcularArea() {
        double areas = 0;
        
        for (int i = 0; i < guardadas; i++) {
            areas += vector[i].calcularArea();
        }
        
        return areas;
    }
    
    // Imprime el titulo, representacion de cada figura y área del dibujo
    public void mostrar() {
        // completar
        String aux = "Titulo: " + this.titulo + "\n";
        
        for (int i = 0; i < guardadas; i++) {
            aux += "\t- " + vector[i].toString() + "\n";
        }
        
        aux += "Área del dibujo: " + calcularArea() + "\n";
        
        System.out.println();
        System.out.println(aux);
    }
    
    // retorna está lleno el dibujo
    public boolean estaLleno() {
        return (guardadas == capacidadMaxima);
    }
    
    
}
