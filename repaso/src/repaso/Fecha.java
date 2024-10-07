/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class Fecha {
    private String ciudad;
    private String dia;
    
    public Fecha(String unaCiudad, String unDia) {
        this.ciudad = unaCiudad;
        this.dia = unDia;
    }        

    public String getCiudad() {
        return ciudad;
    }

    public String getDia() {
        return dia;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public String toString() {
        return this.ciudad + " - " + this.dia;
    }
    
}
