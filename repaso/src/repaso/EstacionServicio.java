/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
import PaqueteLectura.*; 

public class EstacionServicio {
    private String direccion;
    private Surtidor[] surtidores;
    private int surtidoresTotales;
    private int surtidoresDisponibles;
    
    public EstacionServicio(String direccion, int cantidadSurtidores) {
        this.direccion = direccion;
        this.surtidores = new Surtidor[cantidadSurtidores];
        this.surtidoresTotales = cantidadSurtidores;
        this.surtidoresDisponibles = 0;
        
        
        for (int i = 0; i < cantidadSurtidores; i++) {
            this.surtidores[i] = null;
        }
    }
    
    public boolean agregarSurtidor(Surtidor unSurtidor) {
        if (this.surtidoresDisponibles < this.surtidoresTotales) {
            surtidoresDisponibles++;
            
            this.surtidores[surtidoresDisponibles - 1] = unSurtidor;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean cargarVentaASurtidor(int surtidorId, int dni, double litros, String medioPago) {
        double monto = litros * this.surtidores[surtidorId - 1].getPrecio();
        
        Venta v = new Venta(dni, litros, monto, medioPago);
            
        if (this.surtidores[surtidorId -1].agregarVenta(v)) {
            return true;
        } else {
            return false;
        }       
    }
    
    private void cargarVentas(int surtidorId, int cantidadVentas) {
        String[] mediosPago = {"débito", "crédito", "efectivo"};
        
        //int surtidorId, int dni, double litros, String medioPago)
        cargarVentaASurtidor(
                surtidorId,
                GeneradorAleatorio.generarInt(10000),
                GeneradorAleatorio.generarDouble(500) + 1,
                mediosPago[GeneradorAleatorio.generarInt(3)]
        );
    }
    
    public String toString() {
        String aux = this.direccion +
                " - Surtidores: " + this.surtidoresDisponibles + "\n";
        
        for (int i = 0; i < this.surtidoresDisponibles; i++) {
            aux += "  Surtidor " + (i + 1) + ": " + this.surtidores[i].toString() + "\n";
        }
                   
        return aux;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        GeneradorAleatorio.iniciar();
        
        EstacionServicio estacion = new EstacionServicio("19 y 72", 6);
        
        // Creo los surtidores
        Surtidor s1 = new Surtidor("Nafta premium", 682.23, 10);
        Surtidor s2 = new Surtidor("Nafta premium", 682.23, 10);
        Surtidor s3 = new Surtidor("Nafta super", 521.74, 10);
        Surtidor s4 = new Surtidor("Nafta super", 521.74, 10);
        Surtidor s5 = new Surtidor("Gasoil premium", 721.11, 10);
        Surtidor s6 = new Surtidor("Gasoil", 704.51, 10);
                
        
        // Agrego los surtidores a la estación
        estacion.agregarSurtidor(s1);
        estacion.agregarSurtidor(s2);
        estacion.agregarSurtidor(s3);
        estacion.agregarSurtidor(s4);
        estacion.agregarSurtidor(s5);
        estacion.agregarSurtidor(s6);
        
                // Cargo alguna ventas
        String[] mediosPago = {"débito", "crédito", "efectivo"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                int dni = GeneradorAleatorio.generarInt(10000);
                double litros = GeneradorAleatorio.generarDouble(500) + 1;
                String medioPago = mediosPago[GeneradorAleatorio.generarInt(3)];

                estacion.cargarVentaASurtidor(j + 1, dni, litros, medioPago);
            }                          
        }
        
        System.out.println(estacion.toString());
        
    }
    
}
