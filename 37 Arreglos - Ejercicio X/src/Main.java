import java.util.Scanner;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Escribir un programa que reciba un arreglo y un número, luego indicar si el número está presente en el arreglo y en que posición*/

        Scanner entrada = new Scanner(System.in);
        int numeroEntrada;
        int numero_veces = 0;
        Vector<Integer> posiciones = new Vector<Integer>(0);
        int[] numeros = {1,2,8,100,10,15,20,0,56,35,29,100,100};

        System.out.print("Por favor ingrese un numero para verificar que exista en el arreglo actual ");
        numeroEntrada = entrada.nextInt();

        for (int index = 0; index < numeros.length; index++){
            if (numeros[index] == numeroEntrada){
                numero_veces ++;
                posiciones.add((index +1));
            }
        }

        if (numero_veces > 0){
            System.out.println("El numero ingresado, " + numeroEntrada + " Se encuentra " + numero_veces + " veces en el arreglo");
            System.out.println("En las posiciones");
            for (int posicion: posiciones){
                System.out.print(posicion + " ");
            }
        }else{
            System.out.println("El numero no existe en el arreglo");
        }
    }
}