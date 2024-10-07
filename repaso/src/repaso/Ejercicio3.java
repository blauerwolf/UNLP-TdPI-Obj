/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

/**
 *
 * @author dunkelwolf
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gira g;
        EventoOcasional eo;
        String[] lista1 = {
            "FANÁTICO", "Color esperanza 2020", "Yo te diré", "N5", "Disciplina",
            "Quiénes son", "La carie", "Obsesión", "S.O.S", "SUPERSONICO",
            "1Amor", "Mil horas", "Corazón perdido", "Ego", "Ahora",
            "Boomerang", "Tu novia", "Incondicional", "Caliente", "Tu sonrisa"
        };
        
        String[] lista2 = {
            "Cold Heart", "Training Season", "Houdini", "Don't Start Now", "One Kiss",
            "Illusion", "New Rules", "Levitating", "End of an Era", "Hotter than Hell",
            "Physical", "Love Again", "Break my Heart", "Hallucinate", "We're Good",
            "Prisoner", "Be the One", "Future Nostalgia", "Whatcha Doing", "Falling Forever"
        };
        
        String[] ciudades = {
            "Buenos Aires", "La Plata", "Cordoba", "Rosario", "Mendoza", 
            "Montevideo", "La Paz", "Porto Alegre", "Sao Paulo", "Asunción",
            "Rio de Janeiro", "Salvador de Bahía", "Fortaleza", "Caracas", "Medellín",
            "Bogotá", "Cali", "Quito", "Guayaquil", "Santa Cruz de la Sierra",
            "Santiago de Chile", "Santo Domingo", "La Habana", "Miami", "Jacksonville",
            "New York", "Philadelphia", "Ottawa", "Montreal", "Reykjavik",
            "London", "Hamburg", "Oslo", "Roma", "Paris"
        };
        String[] fechas = {
            "02/01/2024", "03/01/2024", "15/01/2024", "18/01/2024", "22/01/2024",
            "11/02/2024", "14/02/2024", "16/03/2024", "17/03/2024", "24/03/2024",
            "31/03/2024", "11/04/2024", "18/04/2024", "21/04/2024", "29/04/2024",
            "01/05/2024", "25/05/2024", "12/06/2024", "30/06/2024", "09/07/2024",
            "16/07/2024", "18/07/2024", "31/07/2024", "15/08/2024", "19/08/2024",
            "11/09/2024", "16/09/2024", "21/09/2024", "04/10/2024", "12/10/2024",
            "24/10/2024", "02/11/2024", "15/11/2024", "20/11/2024", "25/12/2024"
        };
        
        
        // Carga de datos del Evento Ocasional
        eo = new EventoOcasional("Lali del pueblo", 27, "a beneficio", "Provincia de Buenos Aires", "09/10/2024");
        
        // Agrego los temas.
        for (int i = 0; i < 20; i++) {
            eo.agregarTema(lista1[i]);
        }
          
        // Carga de datos de Gira
        g = new Gira("Dua Lipa", 21, "Future Nostalgia", 33);
        
        // Agrego los temas.
        for (int i = 0; i < 20; i++) {
            g.agregarTema(lista2[i]);
        }
        
        for (int i = 0; i < 33; i++) {
            g.agregarFecha(new Fecha(ciudades[i], fechas[i]));
        }
        
        System.out.println("Costo del evento ocasional: " + String.format("%.2f", eo.calcularCosto()));
        System.out.println(eo.actuar());
        
        System.out.println();
        System.out.println("Costo de la gira: " + String.format("%.2f", g.calcularCosto()));
        System.out.println(g.actuar());

    }
    
}
