/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public abstract class Persona {
    private String nombre;
    private int dni;
    private int edad;
    
    public Persona(String unNombre, int unDni, int unaEdad) {
        this.nombre = unNombre;
        this.dni = unDni;
        this.edad = unaEdad;
                     
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString() {
        return this.nombre + " " + this.dni + " " + this.edad + " años";
    }
    
    
    
}
