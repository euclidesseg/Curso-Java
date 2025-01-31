import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Crear y llenar una matriz 3 x 3 transponerla y mostrarla
        *
        * */

        int [][] matriz = new int[3][3];
        int [][] matrizTranspuesta = new int[3][3];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Por favor, indique el dato para la fila " + (i + 1) +" Columna " + (j + 1));
                matriz[i][j] = entrada.nextInt();
            }

        }
        System.out.println("Matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " +  matriz[i][j]  +  " ]");
            }
            System.out.println(" ");
        }
        // calcular transpuesta

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        // imprimir transpuesta
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " +  matrizTranspuesta[i][j]  +  " ]");
            }
            System.out.println(" ");
        }
    }
}