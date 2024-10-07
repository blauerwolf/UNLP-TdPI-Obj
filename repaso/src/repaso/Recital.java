/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public abstract class Recital {
    private String nombreBanda;
    private String[] listaTemas;
    private int cantidadTemas;
    private int temasEnLista;
    
    public Recital(String unNombre, int cantidad) {
        this.nombreBanda = unNombre;
        this.cantidadTemas = cantidad;
        this.temasEnLista = 0;
        this.listaTemas = new String[cantidad];
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public int getCantidadTemas() {
        return cantidadTemas;
    }

    public int getTemasEnLista() {
        return temasEnLista;
    }
    
    
    public boolean agregarTema(String unTema) {
        if (this.temasEnLista < this.cantidadTemas) {
            this.listaTemas[temasEnLista] = unTema;
            this.temasEnLista++;
            return true;
        } else {
            return false;
        }
    }
    
    public String actuar(int i) {
        return "y ahora tocaremos " + this.listaTemas[i];
    }
    
    public String getTemas() {
        String aux = "";
        for (int i = 0; i < this.cantidadTemas - 1; i++) {
            aux += "\t" + listaTemas[i] + "\n";
        }
        return aux;
    }
    
    public abstract double calcularCosto();
    
    public String toString() {
        String aux = this.nombreBanda + "\n" + 
                getTemas();
        
        return aux;
    }
    
    
    
}
