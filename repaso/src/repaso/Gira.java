/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class Gira extends Recital {
    private String nombre;
    private Fecha[] fechas;
    private int cantidadFechas;
    private int fechasConfirmadas;
    private int fechaActual;
    
    
    public Gira(String nombre, int cantidadTemas, String nombreGira, int cantidad) {
        super(nombre, cantidadTemas);
        this.nombre = nombreGira;
        this.cantidadFechas = cantidad;
        this.fechasConfirmadas = 0;
        this.fechas = new Fecha[cantidad];
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadFechas() {
        return cantidadFechas;
    }
    
    public int getFechasConfirmadas() {
        return fechasConfirmadas;
    }

    public int getFechaActual() {
        return fechaActual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadFechas(int cantidadFechas) {
        this.cantidadFechas = cantidadFechas;
    }

    public void setFechaActual(int fechaActual) {
        this.fechaActual = fechaActual;
    }
    
    public boolean agregarFecha(Fecha unaFecha) {
        if (fechasConfirmadas < cantidadFechas) {
            this.fechas[fechasConfirmadas] = unaFecha;
            fechasConfirmadas++;
            return true;
        } else {
            return false;
        }
    }
    
    
    // Si es un evento ocasional devuelve 0 si es a beneficio, 50000 si es un show de TV
    // y 150000 si es privado. Las giras deben devolver 30000 por cada fecha de la misma.
    public double calcularCosto() {
       return 30000 * fechasConfirmadas;
    }
    

    public String actuar() {
        System.out.println("Fecha actual: " + fechaActual);
        String aux = "Buenas noches " + 
                this.fechas[fechaActual].getCiudad() + "\n" +
                super.getTemas();
        
        if (fechaActual < fechasConfirmadas) {
            fechaActual++;
        }
        
        return aux;
    }
    
}
