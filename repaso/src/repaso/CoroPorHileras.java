/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class CoroPorHileras extends Coro {
    private Corista[][] coristas;
    private int hileras;
    private int integrantesPorHilera;
    
    public CoroPorHileras(String unNombre, Director unDirector, int hileras, int integrantes) {
        super(unNombre, unDirector);
        this.hileras = hileras;
        this.integrantesPorHilera = integrantes;
        this.coristas = new Corista[hileras][integrantes];
        
        for (int i = 0; i < this.hileras; i++) {
            for (int j = 0; j < this.integrantesPorHilera; j++) {
                this.coristas[i][j] = null;
            }
        }       
    }

    @Override
    public boolean agregarCorista(Corista unCorista) {
        boolean ok = false;
        int i = 0, j;
        
        while (i < this.hileras && !ok) {
            j = 0;
            
            while (j < this.integrantesPorHilera && !ok) {
                if (this.coristas[i][j] == null) {
                    this.coristas[i][j] = unCorista;
                    ok = true;
                } else {
                    j++;
                }
            }
            i++;
        }
        
        return ok;
    }

    @Override
    public boolean estaLleno() {
        boolean completo = true;
        int i = 0, j = 0;
        
        while (i < this.hileras && !completo) {
            while (j < this.integrantesPorHilera && !completo) {
                if (this.coristas[i][j] != null) {
                    completo = false;
                } else {
                    j++;
                }
            }
            
            i++;
        }
        
        return completo;        
        
    }

    
    // En el caso del coro por hileras, todos los miembros de una misma hilera
    // tienen el mismo tono fundamental y además todos los primeros
    // miembros de cada hilera están ordenados de mayor a menor en cuanto
    // a tono fundamental.
    @Override
    public boolean estaBienFormado() {
        boolean ok = true;
        int notaActual, notaSiguiente;
        int i = 0, j;
        
        while (i < this.hileras - 1 && ok) {
            
            // Chequeo el primer elemento de cada hilera
            notaActual = (this.coristas[i][0] == null 
                    ? -1
                    : this.coristas[i][0].getTonoFundamental()
                    );
            
            notaSiguiente = (this.coristas[i + 1][0] == null 
                    ? -1
                    : this.coristas[i + 1][0].getTonoFundamental()
                    );
            
            if (notaActual != notaSiguiente) {
                ok = false;
            }
            
            j = 0;
            
            // Evaluo las hileras
            while (j < this.integrantesPorHilera - 1 && ok) {
                     
                notaActual = (this.coristas[i][j] == null 
                    ? -1
                    : this.coristas[i][j].getTonoFundamental()
                    );
            
                notaSiguiente = (this.coristas[i + 1][j + 1] == null 
                    ? -1
                    : this.coristas[i + 1][j + 1].getTonoFundamental()
                    );
                
                if (notaActual != notaSiguiente) {
                    ok = false;
                } else {
                    j++;
                }              
            }
            
            i++;       
        }
        
        // Evaluo la última hilera
        j = 0;
        
        while (j < this.integrantesPorHilera - 1 && ok) {
            notaActual = (this.coristas[i][j] == null 
                    ? -1
                    : this.coristas[i][j].getTonoFundamental()
                    );
            
            notaSiguiente = (this.coristas[i][j + 1] == null 
                ? -1
                : this.coristas[i + 1][j + 1].getTonoFundamental()
                );
            
            if (notaActual != notaSiguiente) {
                ok = false;
            } else {
                j++;
            }    
        }
        
        return ok;
    }
    
    
    
    public String getCoristas() {
        
        String aux = "";
        for (int i = 0; i < this.hileras; i++) {
            for (int j = 0; j < this.integrantesPorHilera; j++) {
                if (this.coristas[i][j] != null) {
                    aux += "\t" + this.coristas[i][j].toString() + "\n";
                }
            }
        }
        
        return aux;
    }
    
}
