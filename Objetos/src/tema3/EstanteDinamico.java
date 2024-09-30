/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author eardenghi
 */
public class EstanteDinamico {
    private final Libro[] libros;
    private int dimL = -1;
    private int dimF;
    
    public EstanteDinamico(int cantidadEspacios) {
        this.dimF = cantidadEspacios - 1;
        this.libros = new Libro[cantidadEspacios];
    }
    
    
    public int cantidadLibros() {
        return dimL + 1;
    }
    
    public int tamañoEstante() {
        return dimF;
    }
    
    public boolean estaLleno() {
        return (dimL == dimF);
    }
    
    public boolean agregarLibro(Libro l) {
        if (dimL <= dimF - 1) {
            libros[++dimL] = l;
            
            return true;
        }
        
        return false;
    }
    
    
    public Libro getLibroByTitle(String titulo) {
        int i = 0;
        boolean continuar = true;
        Libro retorno = null;
        
        while (i <= dimL && continuar) {
            if (this.libros[i].getTitulo().equals(titulo)) {
                retorno = this.libros[i];
                continuar = false;
            } else {
                i++;
            }
        }
        
        return retorno;    
    }
    
    public void verEstante() {
        for (int i = 0; i <= dimL; i++) {
            System.out.println(libros[i].getISBN());
        }
    }
}
