import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Hacer un programa que pida tres notas a un usuario, las calcule y las imprima.
        */

        float notal;
        float notall;
        float notalll;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor ingrese la nota 1 ");
        notal = entrada.nextFloat();

        System.out.print("Por favor ingrese la nota 2 ");
        notall = entrada.nextFloat();

        System.out.print("Por favor ingrese la nota 3 ");
        notalll = entrada.nextFloat();

        float suma = notal + notall + notalll;

        System.out.println("La suma total de las notas es " + suma);

        System.out.println("El promedio total de las notas es " + (suma / 3));
    }
}