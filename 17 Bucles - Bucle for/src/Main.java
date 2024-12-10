import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Un bucle for es una estructura repetitiva que repite un bloque de instrucciones un numero determinado de veces
           El bloque de instrucciones que se repite se llama cuerpo del bucle y cada repetición se llama iteración*/

        //sintaxis
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        Scanner entrada = new Scanner(System.in);
        int contador;
        System.out.println("Por favor, ingrese la cantidad de términos");
        contador = entrada.nextInt();

        for (int i  = 2; i<=contador; i +=2 ){
            System.out.println(i);
        }
    }
}