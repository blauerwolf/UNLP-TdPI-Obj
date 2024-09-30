/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author eardenghi
 */
public class Estante {
    private final Libro[] libros = new Libro[20];
    private int dimL = -1;
    
    public Estante() {
        
    }
    
    
    public int cantidadLibros() {
        return dimL + 1;
    }
    
    public boolean estaLleno() {
        return (dimL == 19);
    }
    
    public boolean agregarLibro(Libro l) {
        if (dimL <= 18) {
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
