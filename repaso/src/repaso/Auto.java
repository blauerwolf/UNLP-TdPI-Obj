/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class Auto {
    private String titular;
    private String dominio;

    public Auto(String titular, String dominio) {
        this.titular = titular;
        this.dominio = dominio;
    }

    public String getTitular() {
        return titular;
    }

    public String getDominio() {
        return dominio;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }
    
    public String toString() {
        return this.dominio.toUpperCase() + " - " + this.titular;
    }
    
}
