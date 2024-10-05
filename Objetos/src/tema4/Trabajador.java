/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author dunkelwolf
 */
public class Trabajador extends Persona {
    private String tarea;

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public Trabajador(String tarea, String unNombre, int unDNI, int unaEdad) {
        super(unNombre, unDNI, unaEdad);
        setTarea(tarea);
    }
    
    @Override
    public String toString() {
        return super.toString() + " Soy " + getTarea();
    }

    
    
    
}
