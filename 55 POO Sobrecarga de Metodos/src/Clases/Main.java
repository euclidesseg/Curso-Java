package Clases;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        Persona persona1 = new Persona("Euclides", 28);
        System.out.println(persona1.mostrarDatos());
        persona1.correr();

        Persona persona2 = new Persona("11324657812");
        persona2.correr(12);
        System.out.println(persona2.nombre);
        System.out.println(persona2.mostrarDatos());
    }
    // Cada objeto tiene su propia copia de los atributos no estaticos de la clase
    /*  el constructor que se usa en cada caso determina la copia y por ende
        qué atributos se inicializan y cuales no.


        Cuando se ejecuta:
        Persona persona1 = new Persona("Euclides", 28);
        Se crea un nuevo espacio en memoria para persona1.
        Se asigna "Euclides" a nombre y 28 a edad.
        id queda como null porque el constructor no lo inicializó.

        Luego, al ejecutar:
        Persona persona2 = new Persona("11324657812");
        Se crea un nuevo espacio en memoria para persona2.
        Se asigna "11324657812" a id.
        nombre queda null y edad queda 0 porque el constructor no los inicializó.
        Cada objeto es independiente
        Los atributos de persona1 y persona2 no se comparten.
        Si cambias el nombre en persona1, esto no afecta a persona2.
        Cada objeto tiene su propia versión de los atributos.

     */
}
