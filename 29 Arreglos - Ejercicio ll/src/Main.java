import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Leer 5 números guardarlos en un arreglo y mostrarlo en el orden contrario al introducido*/

        double[] numeros = new double[5];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i ++){
            System.out.print("Por favor, ingrese el numero para la posición " + (i + 1) +" ");
            double numeroIngresado = entrada.nextDouble();
            numeros[i] = numeroIngresado;
        }
        for (int i = 4; i > 0; i --){
            System.out.print(numeros[i] +", ");
        }
    }
}