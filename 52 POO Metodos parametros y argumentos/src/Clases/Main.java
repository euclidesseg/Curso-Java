package Clases;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(("Ingrese el numero 1")));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(("Ingrese el numero 2")));

        Operacion operacion = new Operacion();

        operacion.sumar(numero1,numero2);
        operacion.restar(numero1,numero2);
        operacion.multiplicar(numero1,numero2);
        operacion.dividir(numero1,numero2);

        operacion.imprimir();

    }
}
