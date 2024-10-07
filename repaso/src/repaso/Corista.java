/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class Corista extends Persona {
    public int tonoFundamental;
    
    public Corista(String unNombre, int unDni, int unaEdad, int unTono) {
        super(unNombre, unDni, unaEdad);
        this.tonoFundamental = unTono;
    }

    public int getTonoFundamental() {
        return tonoFundamental;
    }
    
    
    public String toString() {
        return this.getNombre() + " - " + 
                "DNI: " + this.getDni() + ". " + 
                "edad: " + this.getEdad() + ". " +
                "Tono Fundamental: " + this.getTonoFundamental();
    }
    
}
