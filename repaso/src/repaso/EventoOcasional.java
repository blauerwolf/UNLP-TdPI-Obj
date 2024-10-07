/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class EventoOcasional extends Recital {
    private String motivo;
    private String contratante;
    private String dia;
    
    public EventoOcasional(String nombre, int cantidadTemas, String motivo, String contratante, String dia) {
        super(nombre, cantidadTemas);
        this.motivo = motivo;
        this.contratante = contratante;
        this.dia = dia;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getContratante() {
        return contratante;
    }

    public String getDia() {
        return dia;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public String actuar() {
        // beneficio, show de TV o show privado
        String aux = "";
        
        if (motivo == "a beneficio") {
            aux = "Recuerden colaborar con " + this.contratante;
        }
        
        if (motivo == "show de TV") {
            aux = "Saludos amigos televidentes";
        }
        
        if (motivo == "show privado") {
            aux = "Un feliz cumpleaños para " + this.contratante;
        }
            
        return aux;        

    }
    
    // Si es un evento ocasional devuelve 0 si es a beneficio, 50000 si es un show de TV
    // y 150000 si es privado
    public double calcularCosto() {
        double costo;
        switch (motivo) {
            case "a beneficio":
                costo = 0;
                break;
            case "show de TV":
                costo = 50000;
                break;
            case "show privado":
                costo = 150000;
                break;
            default:
                costo = 0;
        }
        
        return costo;
    }
    
}
