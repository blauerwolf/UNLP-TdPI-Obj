/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author dunkelwolf
 */
public abstract class RegistroTemperatura {
    private EstacionMeteorologica estacion;
    private int añoInicial;
    private int cantidadAños;
    private double [][] registro;
    
    public RegistroTemperatura(int inicio, int cantidad, EstacionMeteorologica estacion) {
        setAñoInicial(inicio);
        setCantidadAños(cantidad);
        setEstacion(estacion);
        
        registro = new double[cantidad][12];
        
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < 12; j++)
                registro[i][j] = 999;
        }
    }

    public EstacionMeteorologica getEstacion() {
        return estacion;
    }

    public int getAñoInicial() {
        return añoInicial;
    }

    public int getCantidadAños() {
        return cantidadAños;
    }

    public void setAñoInicial(int añoInicial) {
        this.añoInicial = añoInicial;
    }

    public void setCantidadAños(int cantidadAños) {
        this.cantidadAños = cantidadAños;
    }

    public void setEstacion(EstacionMeteorologica estacion) {
        this.estacion = estacion;
    }
    
    private boolean añoEnRango(int año) {
        return año <= getAñoInicial() + getCantidadAños() - 1;
    }
    
    public void setTemperatura(int mes, int año, double temperatura) {
        if (mes >= 1 && mes <= 12) {
            if (añoEnRango(año)) {
                registro[año][mes - 1] = temperatura;
            } else {
                System.out.println("AÑP Fuera de rango");
            }
        } else {
            System.out.println("Mes fuera de rango");
        }
    }
    
    public double getTemperatura(int mes, int año) {
        if (mes >=1 && mes <= 12) {
            if (añoEnRango(año)) {
                return registro[año - this.getAñoInicial()][mes - 1];
            } else {
                return 888;
            }
        } else {
            System.out.println("Mes llega: " + mes);
            return 999;
        }
    }
    
    public String getTopTemperatura() {
        double maxTemp = -9999;
        int maxAño = -9999;
        int maxMes = -9999;
        
        for (int i = 0; i < getCantidadAños(); i++) {
            for (int j = 0; j < 12; j++) {
                if (registro[i][j] > maxTemp) {
                    maxTemp = registro[i][j];
                    maxAño = i;
                    maxMes = j;
                }
            }
        }
        
        return "Máxima temperatura registrada el mes " + maxMes + " del año " + (maxAño + this.getAñoInicial());
    }
    
    public String toString() {
        String aux = "Estacion " + estacion.getNombre() + 
                " (" + estacion.getLatitud() +
                estacion.getLongitud() + "):";
        return aux;
    }
            
}
