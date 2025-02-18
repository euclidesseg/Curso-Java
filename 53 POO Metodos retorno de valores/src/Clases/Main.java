package Clases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero1,numero2;

        Operacion operacion = new Operacion();

        System.out.println("Ingrese el numero 1 para las operaciones");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el número 2 para las operaciones");
        numero2 = scanner.nextInt();

        System.out.println("La suma es " + operacion.sumar(numero1, numero2));
        System.out.println("La esta es " +  operacion.restar(numero1, numero2));
        System.out.println("La multiplicacion es " +  operacion.multiplicar(numero1, numero2));
        System.out.println("La division es " +  operacion.dividir(numero1, numero2));
    }
}
