import java.sql.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Escribir un arreglo de 10 números y desplazar la primera posición a la segunda y la ultima posición a la primera*/

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i ++){
            System.out.print("Ingrese el valor para la posición: " +(i +1) +" ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }
        for (int numero:numeros){
            System.out.print(numero +" ");
        }
        System.out.println();

        int iterador = 0;
        int ultimo = numeros[9];

        for (int i = 8; i >= 0; i --){
            numeros[i + 1] = numeros[i];
        }

        numeros[0] = ultimo;
        for (int numero:numeros){
            System.out.print(numero +" ");
        }
    }
}