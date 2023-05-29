/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Entidades;

import Enum.RazaPerro;
import java.util.ArrayList;

/**
 *
 * @author Elio
 */
public class Perro {
    
    private String nombre;
    private String raza;
    private RazaPerro razas;
    private String tamanio;
    private Integer edad;
    private boolean adoptado = false;
    
    

    public Perro() {
    }

    public Perro(String nombre, String raza, RazaPerro razas, String tamanio, Integer edad, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.razas = razas;
        this.tamanio = tamanio;
        this.edad = edad;
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public RazaPerro getRazas() {
        return razas;
    }

    public void setRazas(RazaPerro razas) {
        this.razas = razas;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Perro{" + "Nombre: " + nombre + ", Raza: " + razas +  ", Tamaño: " + tamanio + ", Edad: " + edad + ", Adoptado: " + adoptado + '}';
    }

    
    
}
