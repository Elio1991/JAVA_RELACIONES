/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Enum;

/**
 *
 * @author Elio
 */
public enum RazaPerro {
    
    OVEJERO_ALEMAN("Pastor Aleman"), CANICHE("Caniche"), PITBULL("Pitbull"), BEAGLE("Beagle"), SALCHICHA("Salchicha"), CHIHUAHUA("Chuhuahua"),
    DOGO("Dogo"), DOBERMAN("Doberman"), SAN_BERNARDO("San bernardo"), LABRADOR("Labrador"), ROTTWEILER("Rottweiler"), GRAN_DANES("Gran Danes"),
    GALGO("Galgo"), COCKER("Cocker"), BULLDOG("Buldog"), CALLEJERO("Callejero");
    
    private String valor;
    
    private RazaPerro(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    
    @Override
    public String toString() {
        return valor;
    }
    
}
