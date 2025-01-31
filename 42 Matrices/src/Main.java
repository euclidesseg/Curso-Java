import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
       En informática, una matriz es una estructura de datos bidimensional compuesta por
       filas y columnas.
       Cada celda de la matriz puede contener un valor numérico o cualquier otro tipo de dato,
       y es posible realizar operaciones como la suma, la multiplicación o el
       acceso a los elementos de manera eficiente.

       Tambien se puede decir que una matriz es un array de array o un arreglo bidimencional
    */
        int numeros [][] = new int [2][2];

        numeros [0][0] = 5;
        numeros [0][1] = 2;
        numeros [1][0] = 2;
        numeros [1][1] = 5;

        System.out.print("[" + numeros [0][0] + "]");
        System.out.println("[" + numeros [0][1] + "]");
        System.out.print("[" + numeros [1][0] + "]");
        System.out.print("[" + numeros [1][1] + "]");
    }
}