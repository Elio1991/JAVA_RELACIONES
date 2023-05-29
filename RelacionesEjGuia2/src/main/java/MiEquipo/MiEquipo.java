/*
  Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package MiEquipo;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class MiEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo miEquipo = new Equipo();
        List<Jugador> jugadores1 = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cont = 0;
        System.out.println("CREANDO EQUIPO");
        System.out.println("#################");
        do {
            Jugador jugador1 = new Jugador();
            
            System.out.println("Ingrese el nombre: ");
            jugador1.setNombre(leer.next().toUpperCase());
            System.out.println("Ingrese el apellido");
            jugador1.setApellido(leer.next().toUpperCase());
            System.out.println("Ingrese la posicion");
            jugador1.setPosicion(leer.next());
            System.out.println("Ingrese dorsal");
            jugador1.setNumero(leer.nextInt());
           
            jugadores1.add(jugador1);
            miEquipo.setJugadores(jugadores1);
            cont++;
        } while (cont < 11);
       // System.out.println(miEquipo); (metodo ToSting creado en la clase)
        System.out.println("Mi Equipo:");
        for (Jugador jugador : jugadores1) {
            System.out.print(jugador);
            
        }
    }
    
}
