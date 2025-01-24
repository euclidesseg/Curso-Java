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
        Scanner entrada = new Scanner(System.in);
        int [][] matriz = new int[3][3]; // primera forma
        int [][] matriz3x3 = {{1,2,3},{4,5,6},{7,8,9}};


        // llenar la primera matriz

        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el dato numerico para la matriz en la fila" + i + "columna" + j );
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 5; j++) {
                System.out.println(matriz[i][j]);

            }
        }
    }
}