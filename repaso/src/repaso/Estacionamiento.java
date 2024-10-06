/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class Estacionamiento {
    private String nombre;
    private String direccion;
    private String horaApertura;
    private String horaCierre;
    private Auto[][] plazas;
    private int cantidadPisos;
    private int cantidadPlazas;
    private int plazasAsignadas;
    
    public Estacionamiento(String unNombre, String unaDireccion) {
        this.nombre = unNombre;
        this.direccion = unaDireccion;
        this.horaApertura = "08:00";
        this.horaCierre = "12:00";
        this.plazas = new Auto[5][10];
        this.cantidadPisos = 5;
        this.cantidadPlazas = 10;
        this.plazasAsignadas = 0;
        
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 10; j++)
                plazas[i][j] = null;        
    }
    
    public Estacionamiento(String unNombre, String unaDireccion, String horaApertura, String horaCierre, int pisos, int plazasPorPiso) {
        this.nombre = unNombre;
        this.direccion = unaDireccion;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.plazas = new Auto[pisos][plazasPorPiso];
        this.cantidadPisos = pisos;
        this.cantidadPlazas = plazasPorPiso;
        this.plazasAsignadas = 0;
        
        for (int i = 0; i < pisos; i++)
            for (int j = 0; j < plazasPorPiso; j++)
                plazas[i][j] = null;
    }
            
    public boolean setAutoEnPlaza(Auto a, int piso, int plaza) {
        if (piso <= this.cantidadPisos && plaza <= this.cantidadPlazas) {
            if (this.plazas[piso - 1][plaza - 1] == null) {
                this.plazas[piso - 1][plaza - 1] = a;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    // Parto de la base que las patentes son únicas
    public String buscarAuto(String dominio) {
        int i = 0, j = 0;
        boolean continuar = true;
        String mensaje = "Auto Inexistente";
        
        while (i < this.cantidadPisos && continuar) {
            while (j < this.cantidadPlazas && continuar) {

                if (this.plazas[i][j] != null && this.plazas[i][j].getDominio().equals(dominio)) {
                    continuar = false;
                    mensaje = "Piso : " + (i + 1) + " - Plaza: " + (j - 1);
                } else {
                    j++;
                }
                
                i++;
            }
        }
        
        return mensaje;
    }
    
    
    // retorna la cantidad de autos para la plaza, en todos los pisos
    public int getCantidadAutosEnPlaza(int plaza) {
        int total = 0;
        
        for (int i = 0; i < this.cantidadPisos; i++) {
            if (this.plazas[i][plaza - 1] != null) {
                total++;
            }
        }
        
        return total;
    }
    
    
    public String toString() {
        String aux = this.nombre + this.direccion + "\n";
        
        for (int i = 0; i < this.cantidadPisos; i++) {
            for (int j = 0; j < this.cantidadPlazas; j++) {
                aux += "\tPiso " + i + " Plaza " + j + ": " + ((this.plazas[i][j] == null ? "libre" : this.plazas[i][j].toString()) ) + "\n";
            }
        }
        
        return aux;
    }
}
