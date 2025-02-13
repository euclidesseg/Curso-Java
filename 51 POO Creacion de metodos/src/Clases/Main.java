package Clases;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();

        operacion.leerNumeros();
        operacion.sumar();
        operacion.restar();
        operacion.multiplicar();
        operacion.dividir();
        operacion.imprimirResultados();

    }
}