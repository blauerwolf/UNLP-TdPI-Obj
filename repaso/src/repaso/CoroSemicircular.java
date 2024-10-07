/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class CoroSemicircular extends Coro {
    private Corista[] coristas;
    private int cantidadCoristas;
    private int integrantes;
    
    public CoroSemicircular(String unNombre, Director unDirector, int cantidadCoristas) {
        super(unNombre, unDirector);
        this.coristas = new Corista[cantidadCoristas];
        this.cantidadCoristas = cantidadCoristas;
        this.integrantes = 0;
    }

    public int getCantidadCoristas() {
        return cantidadCoristas;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }
    
    
    @Override
    public String getCoristas() {
        String aux = "";
        
        for (int i = 0; i < this.integrantes; i++) {
            aux += "\t" + coristas[i].toString() + "\n";
        }
        
        return aux;
    }

    @Override
    public boolean agregarCorista(Corista unCorista) {
         if (this.integrantes < this.cantidadCoristas) {
             this.coristas[this.integrantes++] = unCorista;    // Debo usar getters + setters?
             return true;             
         } else {
             return false;
         }
    }

    @Override
    public boolean estaLleno() {
        return (this.integrantes == this.cantidadCoristas);
    }

    
    // En el caso del coro semicircular, de izquierda a derecha los coristas
    // están ordenados de mayor a menor en cuanto a tono fundamental.
    @Override
    public boolean estaBienFormado() {
        boolean ok = true;
        
        for (int i = 0; i < this.integrantes - 1; i++) {
            if (!(this.coristas[i].getTonoFundamental() >= this.coristas[i + 1].getTonoFundamental())) {
                ok = false;
            }
        }
        
        return ok;
    }
       
}
