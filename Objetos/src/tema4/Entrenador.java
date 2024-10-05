/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author dunkelwolf
 */
public class Entrenador extends Empleado {
    private int campeonatosGanados;

    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }

    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }
    
    public Entrenador(int campeonatos, String unNombre, double unSueldo, int unaAntigüedad) {
        super(unNombre, unSueldo, unaAntigüedad);
        setCampeonatosGanados(campeonatos);
    }
    
    public double calcularEfectividad() {
        return (double) getCampeonatosGanados() / this.getAntigüedad();
    }
    
    @Override
    public double calcularSueldoACobrar() {
        double plus = 0.0;
        
        if (getCampeonatosGanados() >=1 && getCampeonatosGanados() <= 4)
            plus = 5000;
        else
            if (getCampeonatosGanados() >= 5 && getCampeonatosGanados() <= 10)
                plus = 30000;
            else
                if (getCampeonatosGanados() > 10)
                    plus = 50000;
        
        return this.getSueldoBasico() + plus;
    }
}
