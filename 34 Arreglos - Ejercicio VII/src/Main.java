import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Dado un arreglo de numeros escribir un programa que cree un nuevo arreglo con los elementor en orden inverso */
        int[] numeros = new int[10];
        int[] invertido = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i ++){
            System.out.print("Por favor, ingrese el valor para le posición " + (i +1) + "del arreglo ");
            int valor = scanner.nextInt();
            numeros[i] = valor;
        }

        /*Invertir el arreglo*/
        for (int i = 0; i < 10; i ++){
            invertido[i] = numeros[10 - 1 - i];
        }

        for (int numero:numeros){
            System.out.print(numero +" ");
        }
        System.out.println();
        for (int numero:invertido){
            System.out.print(numero + " ");
        }
    }
}