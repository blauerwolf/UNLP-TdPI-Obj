/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author dunkelwolf
 */
public class RegistroTemperaturaAnual extends RegistroTemperatura {
    
    public RegistroTemperaturaAnual(int inicio, int cantidad, EstacionMeteorologica estacion) {
        super(inicio, cantidad, estacion);
    }
    
    private double calcularPromedio(int unAño) {
        double suma = 0;
        
        for (int i = 1; i <= 12; i++) {
            suma += this.getTemperatura(i, unAño);
        }
        
        return suma / 12;
    }
    
    @Override
    public String toString() {
        String aux = super.toString() + "\n";
        
        for (int i = 0; i < this.getCantidadAños(); i++) {
            aux += "\t- Año " + (i + this.getAñoInicial()) + ": " + 
                    String.format("%.1f", calcularPromedio(i + this.getAñoInicial())) + 
                    " C°;\n";
        }
        
        return aux;
    }
    
}
