/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author dunkelwolf
 */
public class RegistroTemperaturaMensual extends RegistroTemperatura {
    public RegistroTemperaturaMensual(int inicio, int cantidad, EstacionMeteorologica estacion) {
        super(inicio, cantidad, estacion);
    }
    
    private double calcularPromedio(int unMes) {
        double suma = 0;
        
        for (int i = 0; i < this.getCantidadAños(); i++) {
            suma += this.getTemperatura(unMes, i + this.getAñoInicial());
        }
        
        return suma / this.getCantidadAños();
    }
    
    @Override
    public String toString() {
        String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String aux = super.toString() + "\n";
        
        for (int i = 1; i <= 12; i++) {
            aux += "\t- " + meses[i - 1] + ": " + 
                    String.format("%.1f", calcularPromedio(i)) + 
                    " C°;\n";
        }
        
        return aux;
    }
    
}
