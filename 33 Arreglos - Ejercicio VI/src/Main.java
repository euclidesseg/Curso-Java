import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Leer un arreglo de numeros por consola y encontrar el mayor y menor valor en el arreglo*/
        int[] numeros = new int[7];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i ++){
            System.out.print("Por favor, ingrese el valor para la posición " + (i +1) +" Del arreglo ");
            int valor = scanner.nextInt();
            numeros[i] = valor;
        }
        int menor = numeros[0];
        int mayor = numeros[0];

        for (int numero: numeros){
            if(numero >= mayor){
                mayor = numero;
            } else if (numero <= menor) {
                menor = numero;
            }else {
                menor = numero;
                mayor = numero;
            }

        }
        System.out.print("Contenido del arreglo: ");
        for (int numero: numeros){
            System.out.print(numero +" ");
        }
        System.out.println();
        System.out.println("Numero menor es: " + menor);
        System.out.println("Numero mayor es: " + mayor);
    }
}