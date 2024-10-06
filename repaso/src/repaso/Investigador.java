/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class Investigador {
    private String nombre;
    private int categoria;
    private String especialidad;
    private Subsidio[] subsidios;
    private int subsidiosAsignados;

    public Investigador(String nombre, int categoria, String especialidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.especialidad = especialidad;
        this.subsidios = new Subsidio[5];
        this.subsidiosAsignados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // agregar un subsidio al investigador.
    public void agregarSubsidio(Subsidio unSubsidio) {
        if (this.subsidiosAsignados < 5) {
            unSubsidio.setOtorgado(true);
            subsidios[this.subsidiosAsignados++] = unSubsidio;
            System.out.println("Se asignó correctamente el subsidio " + unSubsidio.toString());
        } else {
            System.out.println("Se alcanzó el límite de subsidios.");
        }
    }
    
    public double dineroOtorgado() {
        double suma = 0;
        
        for (int i = 0; i < this.subsidiosAsignados; i++) {
            suma += subsidios[i].getMonto();
        }
        
        return suma;
    }
    
    public void otorgarSubsidios() {
        for (int i = 0; i < this.subsidiosAsignados; i++) {
            if (!subsidios[i].isOtorgado()) {
                subsidios[i].setOtorgado(true);
                System.out.println("Se otorgó el subsidio " + subsidios[i].toString());
            }
        }
    }

    
    
    
}
