/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Service;

import Entidades.Baraja;
import Entidades.Carta;
import Enum.Palo;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class JuegoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Baraja mazoInicial = new Baraja();
    private Baraja cartasEntregadas = new Baraja();
    private Collections c;

    public Baraja crearBaraja() {
        System.out.println("Creando Baraja");

        ArrayList<Carta> mazo = new ArrayList();
        ArrayList<Carta> salida = new ArrayList();

        cartasEntregadas.setBaraja(salida);

        for (Palo aux : Palo.values()) {
            String P = aux.getNombre();
            for (int i = 0; i < 12; i++) {
                if (i + 1 == 8 || i + 1 == 9) {

                } else {
                    Carta c = new Carta(i + 1, aux);
                    mazo.add(c);
                }
            }
        }
        mazoInicial.setBaraja(mazo);
        System.out.println("Mazo Cargado");
        return mazoInicial;
    }

    public void barajar() {
        System.out.println("Mezclando cartas");
        c.shuffle(mazoInicial.getBaraja());

    }

    public void siguienteCarta() {
        if (mazoInicial.getBaraja().size() == 0) {
            System.out.println("No quedan cartas por entregar");
        } else {
            System.out.println("Siguiente Carta:" + mazoInicial.getBaraja().get(mazoInicial.getBaraja().size() - 1));
        }
    }

    public void cartasDisponibles() {
        if (mazoInicial.getBaraja().size() == 0) {
            System.out.println("No quedan cartas por repartir");
        } else {
            System.out.println("El número de cartas disponibles por repartir es: " + mazoInicial.getBaraja().size());
        }
    }

    public void darCartas(int aux) {
        if (aux > mazoInicial.getBaraja().size()) {
            System.out.println("El numero de cartas disponibles es menor a las solicitadas");
        } else {
            System.out.println("Las cartas solicitadas fueron entregadas");
            for (int i = 0; i < aux; i++) {
                cartasEntregadas.getBaraja().add(mazoInicial.getBaraja().remove(mazoInicial.getBaraja().size() - 1));
            }
        }

    }

    public void cartasMonton() {

        if (cartasEntregadas.getBaraja().size() == 0) {
            System.out.println("Todavía no se entregaron cartas");
        } else {

            System.out.println(cartasEntregadas.getBaraja().toString());
        }
    }

    public void mostrarBaraja() {
        if (mazoInicial.getBaraja().size() == 0) {
            System.out.println("No quedan cartas por repartir");
        } else {
            System.out.println(mazoInicial.toString());
        }
    }
}
