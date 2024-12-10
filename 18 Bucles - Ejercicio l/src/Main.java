import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /* Leer un número por pantalla y mostrar su cuadrado, repetir el proceso
       hasta que se introduzca un número negativo.
     */

        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int cuadrado;

        while (numero >= 0){

            cuadrado = numero * numero;
            System.out.println("El número " + numero + " Elevado al cuadrado es: "+ cuadrado);

            System.out.println("Por favor ingrese el número el cual desea obtenér su cuadrado");
            numero = entrada.nextInt();
        }
    }
}