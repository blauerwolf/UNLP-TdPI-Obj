/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */

import PaqueteLectura.*;

public class Surtidor {
    private String combustible;
    private double precio;
    private Venta[] ventas;
    private int ventasMax;
    private int ventasRealizadas;
    
    public Surtidor(String combus, double precio, int V) {
        this.combustible = combus;
        this.precio = precio;
        this.ventas = new Venta[V];
        this.ventasMax = V;
        this.ventasRealizadas = 0;
        
        for (int i = 0; i < V; i++) {
            this.ventas[i] = null;
        }
    }

    public double getPrecio() {
        return precio;
    }
    
       
    public boolean agregarVenta(Venta v) {
        // Venta(int unDni, double litros, double monto, String medio)
        if (ventasRealizadas < ventasMax) {
            
            ventasRealizadas++;
            this.ventas[ventasRealizadas - 1] = v;
            
            return true;
        } else {
            return false;
        }
        
    }
    
    public String toString() {
        String aux = this.combustible + " " +
                "$" + this.precio;
        
        aux += " Ventas:";
        
        for (int i = 0; i < this.ventasRealizadas; i++) {
            aux += "[DNI: " + this.ventas[i].getDni() + " " +
                    "Litros: " + String.format("%.2f", this.ventas[i].getLitrosCargados()) + " " +
                    "$" + String.format("%.2f", this.ventas[i].getMontoAbonado()) + " " +
                    this.ventas[i].getMedioPago() + "]";
        }
        
        return aux;
    }
                     
}
