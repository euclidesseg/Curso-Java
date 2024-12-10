import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Escribir un programa que escriba un arreglo de números enteros y cuente todos los números pares e impares*/
        int[] enteros = new int[10];
        int numero_pares = 0;
        int numero_impares = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i ++){
            int ingresado;
            System.out.print("Por favor ingrese el valor para la posición " + (i +1) +" ");
            ingresado = scanner.nextInt();
            enteros[i] = ingresado;
        }

        System.out.println("Los valores del arreglo son: ");
        for (int entero:enteros){
            System.out.print(entero +" ");
            if ((entero%2 == 0)){
                numero_pares ++;
            }else{
                numero_impares ++;

            }
        }
        System.out.println();
        System.out.println("Número de enteros pares: " + numero_pares);
        System.out.println("Número de enteros impares: " + numero_impares);

    }
}