/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class Director extends Persona {
    private int antigüedad;
    
    public Director(String unNombre, int unDni, int unaEdad, int unaAntigüedad) {
        super(unNombre, unDni, unaEdad);
        this.antigüedad = unaAntigüedad;
                
    }
}
