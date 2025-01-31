import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
            crear y cargar una matriz de tamaño n x m e indicar si es simétrica o no.

        * */
         int [][] matriz;
         int [][] matrizTranspuesta;

         int nFilas = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite el numero de filas"));
         int nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el número de columnas"));
         matriz = new int[nFilas][nColumnas];
         matrizTranspuesta = new int[nFilas][nColumnas];

         // LLenar matriz
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato para la fila " +(i +1) +" Columna " + (j + 1)));
            }
        }

        // Imprimir matriz
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("["+ matriz[i][j] + "] ");
            }
            System.out.println(" ");
        }
        boolean isSimetrica = true;
        // Definir simetría
        // Comparar filas y colunas
        if (nFilas == nColumnas){
            // Definir transpuesta de matriz
            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < nColumnas; j++) {
                    matrizTranspuesta[j][i] = matriz[i][j];
                }
            }

            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < nColumnas; j++) {
                    if (matriz[i][j] != matrizTranspuesta[i][j]){
                        isSimetrica = false;
                        break;
                    }
                }
                if(!isSimetrica) break;

            }
            System.out.println(" ");
            System.out.println(" ");

            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < nColumnas; j++) {
                    System.out.print("["+ matrizTranspuesta[i][j] + "] ");
                }
                System.out.println(" ");
            }
        }

        if(nFilas != nColumnas){
            JOptionPane.showMessageDialog(null, "La matriz dada no es cuadrada, por tanto, no puede ser una matriz simétrica");
        }else if(isSimetrica){
            JOptionPane.showMessageDialog(null, "La matriz dada es una matriz simétrica");
        } else{
            JOptionPane.showMessageDialog(null, "La matriz dada no es una matriz simétrica dado que su transpuesta no cumple con las propiedades de simetría");
        }
    }
}