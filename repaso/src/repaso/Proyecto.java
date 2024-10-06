/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class Proyecto {
    private String nombre;
    private int codigo;
    private String director;
    private Investigador[] investigadores;
    private int cantidadInvestigadores;
    
    public Proyecto(String unNombre, int cod, String director) {
        this.nombre = unNombre;
        this.codigo = cod;
        this.director = director;
        this.investigadores = new Investigador[50];
        this.cantidadInvestigadores = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDirector() {
        return director;
    }
    
    public int getCantidadInvestigadores() {
        return cantidadInvestigadores;
    }
    
    public Investigador getInvestigadorById(int id) {
        if (id < getCantidadInvestigadores()) {
            return investigadores[id];
        } else {
            return null;
        }
    }
    
    
    // El investigadorId es la posición del vector de investigadores
    public void setSubsidioByInvestigadorId(int investigadorId, Subsidio unSubsidio) {
        this.investigadores[investigadorId].agregarSubsidio(unSubsidio);
    }
    
    
    // agregar un investigador al proyecto.
    public void agregarInvestigador(Investigador unInvestigador) {
        if (this.cantidadInvestigadores < 50) {
            investigadores[this.cantidadInvestigadores++] = unInvestigador;
           
        } else {
            System.out.println("No hay más cupos para nuevos investigadores. Förlåt!");
        }
    }

    //devolver el monto total otorgado en subsidios del proyecto (tener en cuenta
    //todos los subsidios otorgados de todos los investigadores)
    public double dineroTotalOtorgado() {
        double suma = 0;
        
        for (int i = 0; i < this.cantidadInvestigadores; i++) {
            suma += investigadores[i].dineroOtorgado();
        }
        
        return suma;
    }
    
    // otorgar todos los subsidios no-otorgados del investigador llamado
    // nombre_completo
    public void otorgarTodos(String nombre_completo) {
        int i = 0;
        boolean continuar = true;
        
        while (i < this.cantidadInvestigadores && continuar) {
            if (investigadores[i].getNombre().equals(nombre_completo)) {
                continuar = false;
                investigadores[i].otorgarSubsidios();
            } else {
                i++;
            }
        }
    }
    
    
    public String toString() {
        String aux = getNombre() +
                " Cod: " + getCodigo() +
                " Director: " + getDirector() +
                " Total otorgado: $" + dineroTotalOtorgado() + "\n";
        
        for (int i = 0; i < this.cantidadInvestigadores; i++) {
            aux += "Investigador: " + investigadores[i].getNombre() + "\n" +
                    "\t - Categoria: " + investigadores[i].getCategoria() + "\n" +
                    "\t - Especialidad: " + investigadores[i].getEspecialidad() + "\n" +
                    "\t - Subs. otorgados: $" + investigadores[i].dineroOtorgado() + "\n";
        }
        
        return aux;
    }



    
}
