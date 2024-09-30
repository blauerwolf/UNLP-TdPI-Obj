/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author eardenghi
 */
import PaqueteLectura.GeneradorAleatorio;

public class Cliente {
    private int dni;
    private String nombre;
    private int edad;
    
    
    public Cliente(int dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Cliente() {
        this.dni = GeneradorAleatorio.generarInt(1000);
        this.nombre = GeneradorAleatorio.generarString(5);
        this.edad = GeneradorAleatorio.generarInt(120);
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "DNI: " + this.dni + ". Nombre: " + this.nombre + ". Edad: " + this.edad;
    }

}
