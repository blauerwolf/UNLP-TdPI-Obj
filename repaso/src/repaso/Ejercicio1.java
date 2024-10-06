/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Proyecto proy;
        Investigador inv1, inv2, inv3;
        Subsidio sub1, sub2;
        int cantidadInvestigadores;
        
        inv1 = new Investigador("Albert Einstein", 5, "Fisica Relativista");
        inv2 = new Investigador("Nikola Tesla", 5, "Fisico");
        inv3 = new Investigador("Marie Curie", 5, "Fisica Nuclear");
        
        sub1 = new Subsidio(1300000.59, "Estudios avanzado de agujeros de gusano");
        sub2 = new Subsidio(4000000.63, "Estudios sobre curvatura de la luz");
        
        proy = new Proyecto("Teoría unificada relativista y newtoniana", 11321, "Johannes Kepler");
        
        proy.agregarInvestigador(inv1);
        proy.agregarInvestigador(inv2);
        proy.agregarInvestigador(inv3);
        
        // Imprimo
        System.out.println("Información del proyecto");
        System.out.println(proy.toString());
        
        cantidadInvestigadores = proy.getCantidadInvestigadores();
        
        // Agrego los subsidios
        for (int i = 0; i < cantidadInvestigadores; i++) {
            proy.setSubsidioByInvestigadorId(i, sub1);
            proy.setSubsidioByInvestigadorId(i, sub2);
        }
        
        // Imprimo
        System.out.println();
        System.out.println("Información del proyecto");
        System.out.println(proy.toString());
        
        
    }
    
}
