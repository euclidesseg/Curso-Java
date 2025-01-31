import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
        En Java, para imprimir una matriz (o arreglo bidimensional),
        generalmente se utiliza un bucle anidado: uno para las filas y
        otro para las columnas. Cada elemento de la matriz se accede mediante
        índices de fila y columna.
    */
            int [][] matriz3x3 = {{1,2,3},{4,5,6},{7,8,9}};

            // bucle para recorrer las filas
            for (int i = 0; i < 3; i++ ){
                // bucle para recorrer las columnas
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz3x3[i][j] + " ");
                }
                System.out.println();

            }
        }
    }