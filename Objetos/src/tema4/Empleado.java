/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author dunkelwolf
 */
public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;
    private int antigüedad;

    
    public String getNombre() {
        return nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }
    
    public Empleado(String unNombre, double unSueldo, int unaAntigüedad) {
        setNombre(unNombre);
        setSueldoBasico(unSueldo);
        setAntigüedad(unaAntigüedad);
    }
    
    public String toString() {
        String aux = getNombre() +
            " Basico: $" + getSueldoBasico() +
            " Antigüedad: " + getAntigüedad() + 
            " Efectividad: " + calcularEfectividad() +
            " Sueldo a cobrar: $" + this.calcularSueldoACobrar();
            
        return aux;
            
    }
    
    public abstract double calcularEfectividad();
    public double calcularSueldoACobrar() {
        return getSueldoBasico() * 1.1 * getAntigüedad();
    }
    
    
}
