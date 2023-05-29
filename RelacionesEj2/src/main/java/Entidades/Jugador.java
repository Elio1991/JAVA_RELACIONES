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
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Jugador {

    Juego juego = new Juego(); //instancio el juego.
    private Integer ID;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer ID, String nombre, boolean mojado) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
       
        return "ID: " + ID + ", Nombre: " + nombre + ", Mojado: " + mojado + "]";
    }

    public void mostrarJugadores(Juego juego) {
        System.out.println("Lista de jugadores");
        System.out.println("-------------------");
        for (Jugador jugador : juego.getJugadores()) {
            System.out.println(jugador.getID() + "-" + jugador.getNombre());
        }
    }

    public void crearJugadores() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        RevolverDeAgua revolver = new RevolverDeAgua();
        ArrayList<Jugador> jugadoresX = new ArrayList(); //creo una arraylist local.
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
            juego.setJugadores(jugadoresX); // seteo la lista del juego con la lista creada localmente.
            ingresados++;

        } while (ingresados != cantJugadores);

    }

    public boolean disparo(RevolverDeAgua revolver) {

        if (revolver.mojar()) {

            setMojado(true);
            return true;
        } else {

            revolver.siguienteChorro();
            return false;
        }
    }

}
