import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /* Las matrices al igual que los arreglos tambien pueden tener un comportamiento
        *  dinámico, es decir, que tambien podemos llenar e imprimir una matriz haciendo uso
        *  de la entrada por teclado*/


        //campos variables

        int filas = 0;
        int columnas = 0;

        filas = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el tamaño de las filas "));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el tamaño de las columnas "));

        int[][] matriz = new int[filas][columnas] ;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el valor para la fila [" + (i) +"] Columna [" + j + "]"));
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("["+ matriz[i][j] +"]" + " ");
            }
            System.out.println();
        }
    }
}