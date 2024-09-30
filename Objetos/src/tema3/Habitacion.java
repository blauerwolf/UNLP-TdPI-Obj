/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author eardenghi
 */

import PaqueteLectura.*;

public class Habitacion {
    private double costoPorNoche;
    private boolean estaOcupada;
    private Cliente cliente;

    public Habitacion(double costoPorNoche, boolean estaOcupada, Cliente cliente) {
        this.costoPorNoche = costoPorNoche;
        this.estaOcupada = estaOcupada;
        this.cliente = cliente;
    }
    
    public Habitacion() {
        this.costoPorNoche = GeneradorAleatorio.generarDouble(6000) + 2000;
        this.estaOcupada = false;
        this.cliente = null;
    }

    public double getCostoPorNoche() {
        return costoPorNoche;
    }

    public boolean getEstaOcupada() {
        return estaOcupada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCostoPorNoche(double costoPorNoche) {
        this.costoPorNoche = costoPorNoche;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }   
}
