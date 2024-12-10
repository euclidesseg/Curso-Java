import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Crear un programa que lea un número entero y muestre si el número es múltiplo de 10*/

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Por favor, ingrese un numero ");
        numero = entrada.nextInt();

        if(numero % 10 == 0){
            System.out.println("El numero " + numero + " Es múltiplo de 10");
        }else{
            System.out.println("El numero " + numero + " No es múltiplo de 10");
        }
    }
}