/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class Venta {
    private int dni;
    private double litrosCargados;
    private double montoAbonado;
    private String medioPago;
    
    public Venta(int unDni, double litros, double monto, String medio) {
        this.dni = unDni;
        this.litrosCargados = litros;
        this.montoAbonado = monto;
        this.medioPago = medio;
        
    }

    public int getDni() {
        return dni;
    }

    public double getLitrosCargados() {
        return litrosCargados;
    }

    public double getMontoAbonado() {
        return montoAbonado;
    }

    public String getMedioPago() {
        return medioPago;
    }
    
    
    
    public String toString() {
        return this.dni + " " +
                this.litrosCargados + " litros " +
                "$ " + this.montoAbonado + " " +
                this.medioPago;
    }
    
}
