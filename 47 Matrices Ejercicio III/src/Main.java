import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*  Crear y cargar una matriz de tamaño n x m y mostrar
         la suma de cada fila y cada columna
        * */
        int nFIlas, nColumnas;
        int[][] matriz;
        Scanner scanner = new Scanner(System.in);
        int sumaFilas = 0;
        int sumaColumnas = 0;
        HashMap<Integer, Integer> mapaSumaFilas = new HashMap<>();
        HashMap<Integer, Integer> mapaSumaColumnas  = new HashMap<>();
        int contadorFilas = 0;
        int contadorColumnas = 0;

        System.out.println("Por favor diga cuantas filas tendrá la matriz");
        nFIlas = scanner.nextInt();
        System.out.println("Por favor diga cuantas columnas tendrá la matriz");
        nColumnas = scanner.nextInt();

        matriz = new int[nFIlas][nColumnas];

        for (int i = 0; i < nFIlas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                matriz[i][j] = (int) (Math.random()*((10 - 1) + 1) + 1);
            }
        }

        for (int i = 0; i < nFIlas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println(" ");
        }


        for (int i = 0; i < nFIlas; i++) {
                for (int j = 0; j < nColumnas; j++) {
                    sumaFilas += matriz[i][j];
                }
                mapaSumaFilas.put(i, sumaFilas);
                sumaFilas = 0;
        }
        for (int j = 0; j <  nColumnas; j++) {
            for (int i = 0; i < nFIlas; i++) {
                sumaColumnas += matriz[i][j];
            }
            mapaSumaColumnas.put(j, sumaColumnas);
            sumaColumnas = 0;
        }

        System.out.println("Suma de columnas: " + mapaSumaColumnas );
        System.out.println("Suma de filas: " + mapaSumaFilas);
    }
}