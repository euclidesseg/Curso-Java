package Clases;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        Persona persona1 = new Persona("Euclides", 28);
        System.out.println(persona1.mostrarDatos());
        persona1.correr();

        Persona persona2 = new Persona("11324657812");
        persona2.correr(12);
        System.out.println(persona2.mostrarDatos());
    }
}
