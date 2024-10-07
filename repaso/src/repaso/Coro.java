/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public abstract class Coro {
    private String nombre;
    private Director director;
    
    public Coro(String unNombre, Director unDirector) {
        this.nombre = unNombre;
        this.director = unDirector;
    }
    
    
    public abstract String getCoristas();
    public abstract boolean agregarCorista(Corista unCorista);
    public abstract boolean estaLleno();
    public abstract boolean estaBienFormado();
    
    public String toString() {
        return this.nombre + "\n" +
                "Director: " + this.director + "\n" +
                "Coristas: \n" +
                this.getCoristas();
        
    }
    
    
}
