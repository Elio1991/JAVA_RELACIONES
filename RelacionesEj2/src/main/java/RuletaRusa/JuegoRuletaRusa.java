/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package RuletaRusa;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Elio
 */
public class JuegoRuletaRusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<Jugador> jugadoresX = new ArrayList();
      RevolverDeAgua revolver = new RevolverDeAgua();
      Jugador jugador = new Jugador();
      
        System.out.println("JUEGO DE LA RULETA RUSA DE AGUA");
        System.out.println("###############################");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int cantJugadores = 0;
        int cantTotal = 6;
        int ingresados = 0;
        System.out.println("Ingrese la cantidad de jugadores");
        cantJugadores = leer.nextInt();

        if (cantJugadores > 6) {
            System.out.println("La cantidad de jugadores excede el límite total permitido, el total sera de 6 jugadores ");
            cantJugadores = cantTotal;
        }
        do {
            Jugador jugadorX = new Jugador(); //creo un jugador por cada vuelta.
            System.out.println("Ingrese el nombre del jugador número " + (ingresados + 1));
            jugadorX.setID(ingresados + 1);
            jugadorX.setNombre(leer.next()); //seteo el nombre del jugador.
            jugadoresX.add(jugadorX); // lo añado a la lista.
            //juego.setJugadores(jugadoresX); // seteo la lista del juego con la lista creada localmente.
            ingresados++;

        } while (ingresados != cantJugadores);
      
          System.out.println("Se procede a llenar el revolver");
          revolver.llenarRevolver();
          System.out.println(revolver.toString());
          System.out.println("Arranca el juego");
          Juego juego = new Juego();
          juego.llenarJuego(jugadoresX, revolver);
          jugador.mostrarJugadores(juego);
          juego.ronda();
          System.out.println(juego.toString());
              
    }
    
}
