/*
  Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Personas;

import Entidades.DNI;
import Entidades.Persona;

/**
 *
 * @author Elio
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona pers = new Persona();
        DNI dni = new DNI();
        dni.setNumero(36723165);
        dni.setSerie("DNI");
        pers.setApellido("Chamorro");
        pers.setDni(dni);
        System.out.println(pers);
        
       
        
    }
    
}
