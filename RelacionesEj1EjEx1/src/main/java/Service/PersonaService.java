/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
1.(Ex.) Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Service;

import Entidades.Perro;
import Entidades.Persona;
import Enum.RazaPerro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class PersonaService {

    private Persona perros1 = new Persona();
    private Persona personas1 = new Persona();
    private ArrayList<Perro> perros = new ArrayList();
    private ArrayList<Persona> personas = new ArrayList();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPerro() {
        String resp;

        do {
            Perro perro = new Perro();
            System.out.println("Ingrese el nombre del perro");
            perro.setNombre(leer.next().toUpperCase());
            boolean setRaza = false;
            do {
                System.out.println("Ingrese la raza del perro de la lista");
                for (RazaPerro raza1 : RazaPerro.values()) {
                    System.out.println(raza1.getValor());
                }
                resp = leer.next();

                for (RazaPerro raza2 : RazaPerro.values()) {
                    if (raza2.getValor().equalsIgnoreCase(resp)) {
                        perro.setRazas(raza2);
                        setRaza = true;
                        System.out.println("Raza Establecida");
                        break;
                    }
                }
                if (!setRaza) {
                    System.out.println("La raza seleccionada no esta en la lista");
                }
            } while (!setRaza);

            System.out.println("Ingrese la edad del perro");
            perro.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamaño del perro(chico/mediano/grande)");
            perro.setTamanio(leer.next());
            perros.add(perro);

            System.out.println("Desea seguir rescatando perritos?(S/N)");
            resp = leer.next();

            while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                System.out.println("Ingrese una opcion válida");
                resp = leer.next();
            }
        } while (!resp.equalsIgnoreCase("N"));
        perros1.setPerros(perros);
        System.out.println(perros1.toString());
    }

    public void crearPersona() {
        String resp;
        do {
            Persona pers = new Persona();

            System.out.println("Ingrese el nombre de la persona");
            pers.setNombre(leer.next().toUpperCase());
            System.out.println("Ingrese el apellido de la persona");
            pers.setApellido(leer.next().toUpperCase());
            System.out.println("Ingrese la edad de la persona");
            pers.setEdad(leer.nextInt());
            System.out.println("Ingrese el DNI de la persona");
            pers.setDNI(leer.nextInt());
            personas.add(pers);
            personas1.setPersonas(personas);
            System.out.println("Desea agregar mas personas? (S/N)");
            resp = leer.next();
            while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N")) {
                System.out.println("Ingrese una opcion válida");
                resp = leer.next();
            }
        } while (!resp.equalsIgnoreCase("N"));

    }

    public void asignarPerro() {
        String opc;
        boolean adoptado;
        boolean enlista = false;

        for (Persona persona : personas) {
            System.out.println(persona.getNombre());
            System.out.println("Seleccione un perro de la lista para adoptar");
            do {
               do { 
                for (int i = 0; i < perros.size(); i++) {
                    System.out.println((i + 1) + "-" + perros.get(i).getNombre());
                }
                
                    opc = leer.next();
                    adoptado = false;
                    for (Perro perro : perros) {

                        if (perro.getNombre().equalsIgnoreCase(opc)) {
                            System.out.println(opc);
                            enlista = true;
                            if (perro.isAdoptado()) {
                                System.out.println("El perro ya fue adoptado, elija otro perrito");
                                adoptado = true;
                                break;
                            } else {
                                System.out.println("El perrito es tuyo, cuidalo");
                                perro.setAdoptado(true);
                                persona.setPerro(perro);
                            }
                            break;
                        } 

                    }
                } while (adoptado);

                if (!enlista) {
                    System.out.println("El perro no esta en la lista, ingrese el nombre correctamente");
                }
            } while (!enlista);
        }
    }

    public void mostrarPersonas() {
        for (Persona pers1 : personas) {
            System.out.println(pers1);
        }

    }

    public void mostrarPerro() {
        for (Perro perrito : perros) {
            System.out.println(perrito);
        }
    }
}
