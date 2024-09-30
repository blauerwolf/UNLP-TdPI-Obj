/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author eardenghi
 */
public class Hotel {
    private final Habitacion[] habitaciones;
    private final int dimF;

    public Hotel(int cantidadHabitaciones) {
        this.dimF = cantidadHabitaciones - 1;
        
        habitaciones = new Habitacion[cantidadHabitaciones];
        
        for (int i = 0; i <= dimF; i++) {
            this.habitaciones[i] = new Habitacion();
        }
    }
    
    public int getCantidadHabitaciones() {
        return dimF + 1;
    }
    
    public Habitacion getHabitacion(int numero) {
        if (numero <= dimF) {
            return habitaciones[numero];
        } else {
            return null;
        }
    }
    
    public boolean setClienteToHabitacion(Cliente c, int habitacion) {
        if (habitacion <= dimF) {
            habitaciones[habitacion].setCliente(c);
            habitaciones[habitacion].setEstaOcupada(true);
            return true;
        } else {
            return false;
        }
    }
    
    public void setInflacionarPrecios(float monto) {
        for (int i = 0; i <= dimF; i++) {
            habitaciones[i].setCostoPorNoche(habitaciones[i].getCostoPorNoche() + monto);
        }
    }
    
    @Override
    public String toString() {
        String retorno = "";
        for (int i = 0; i <= dimF; i++) {
            
            retorno += "Habitacion " + i + ": ";
            retorno += String.format("%.2f", habitaciones[i].getCostoPorNoche());
            retorno += ", " + (habitaciones[i].getEstaOcupada() ? "ocupada" : "libre");
            if (habitaciones[i].getEstaOcupada()) {
                retorno += ", " + habitaciones[i].getCliente().toString();
            }
            retorno += "\n";
        }
        
        return retorno;
    }
}
