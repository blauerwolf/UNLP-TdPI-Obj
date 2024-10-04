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

public class Cliente extends Persona{
    //private int dni;
    //private String nombre;
    //private int edad;
    
    
    public Cliente(int dni, String nombre, int edad) {
        //this.dni = dni;
        //this.nombre = nombre;
        //this.edad = edad;
        super(nombre, dni, edad);
    }
    
    public Cliente() {
        
        super(
            GeneradorAleatorio.generarString(5),
            GeneradorAleatorio.generarInt(1000),
            GeneradorAleatorio.generarInt(120)
        );
    }

    public int getDni() {
        //return dni;
        return super.getDNI();
    }

    @Override
    public String getNombre() {
        //return nombre;
        return super.getNombre();
    }

    @Override
    public int getEdad() {
        //return edad;
        return super.getEdad();
    }
    
    public void setDni(int dni) {
        //this.dni = dni;
        super.setDNI(dni);
    }

    @Override
    public void setNombre(String nombre) {
        //this.nombre = nombre;
        super.setNombre(nombre);
    }

    @Override
    public void setEdad(int edad) {
        //this.edad = edad;
        super.setEdad(edad);
    }
    
    @Override
    public String toString() {
        return "DNI: " + getDni() + ". Nombre: " + getNombre() + ". Edad: " + getEdad();
    }

}
