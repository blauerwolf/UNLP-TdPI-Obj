/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author dunkelwolf
 */
public class Jugador extends Empleado {
    private int partidosJugados;
    private int golesAnotados;

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }
       
    public Jugador(int partidos, int goles,  String unNombre, double unSueldo, int unaAntigüedad) {
        super(unNombre, unSueldo, unaAntigüedad);
        setPartidosJugados(partidos);
        setGolesAnotados(goles);
    }
    
    public double calcularEfectividad() {
        return (double) getGolesAnotados() / getPartidosJugados();
    }
    
    
    @Override
    public double calcularSueldoACobrar() {
        return (calcularEfectividad() > 0.5 ? super.calcularSueldoACobrar() * 2 : super.calcularSueldoACobrar());
    }
    
}
