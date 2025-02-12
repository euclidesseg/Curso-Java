import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
         /*
            Crear un matriz de 5 x 5
            Llenar la matriz con números aleatorios.

            A partir de la matriz anteriormente creada.

            Mostrar en consola el promedio de la matriz.
            Mostrar en consola el número mayor y la cantidad de veces que este se repite.
            Mostrar en consola todos los números primos.
            Mostrar en consola todos los números pares.
            Mostrar en consola la suma de las diagonales
            Mostrar en consola la suma de la la última fila.
            Mostrar en consola el mensaje "Cuadrado Mágico" si la matriz cataloga como un cuadrado mágico.
        * */
        int nFilas = 3;
        int nColumnas = 3;
        int[][] matriz = new int[nFilas][nColumnas];
        float promedio = 0f;
        int suma_matriz = 0;
        int numeroMayor = 0;
        int numeroVecesRepetidasNumeroMaryor = 1;
        ArrayList<Integer> numerosPrimos = new ArrayList<>();
        ArrayList<Integer> numerosPares = new ArrayList<>();
        int sumaDiagonalPrincipalUno = 0;
        int sumaDiagonalPrincipalDos = 0;
        int sumaUltimaFila = 0;
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10 ) +1;
            }
        }
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("[" +  matriz[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }

        // Calculo del promedio de la matriz

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                suma_matriz += matriz[i][j];
            }
        }
        promedio = (float) suma_matriz / (nFilas * nColumnas);
        System.out.println("El promedio de esta matriz es: " + promedio);

        // Mostrar el número mayor
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                if (numeroMayor < matriz[i][j]){
                    numeroMayor = matriz[i][j];
                    numeroVecesRepetidasNumeroMaryor = 1;
                }else if(numeroMayor == matriz[i][j]){
                    numeroVecesRepetidasNumeroMaryor ++;
                }
            }
        }


        //Calcular numeros pares y primos
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                if(Main.esPrimo(matriz[i][j]) == true){
                    numerosPrimos.add(matriz[i][j]);
                }
                if(matriz[i][j] % 2 == 0){
                    numerosPares.add(matriz[i][j]);
                }
            }
        }

        // Calcular suma de las diagonales
        int contadorDiagonalDos = nColumnas - 1;
        for (int i = 0; i < nFilas; i++) {
            sumaDiagonalPrincipalDos += matriz[i][contadorDiagonalDos];
            sumaDiagonalPrincipalUno += matriz[i][i];
            contadorDiagonalDos --;
        }

        //Mostrar en consola la suma de la la última fila.
        for (int i = 0; i < (nColumnas); i++) {
           sumaUltimaFila += matriz[nFilas - 1][i];
        }

        // Calcular si la matriz es cuadrado mágico
        boolean esCuadradoMagico = true;
        int sumaReferencia = sumaDiagonalPrincipalUno;

        // Verificar que todas las filas tengan la misma suma
        for (int i = 0; i < nFilas; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < nColumnas; j++) {
                sumaFilas += matriz[i][j];
            }
            if (sumaFilas != sumaReferencia) {
                esCuadradoMagico = false;
                break;
            }
        }

        // Verificar que todas las columnas tengan la misma suma
        for (int j = 0; j < nColumnas && esCuadradoMagico; j++) { // Se detiene si ya falló antes
            int sumaColumnas = 0;
            for (int i = 0; i < nFilas; i++) {
                sumaColumnas += matriz[i][j];
            }
            if (sumaColumnas != sumaReferencia) {
                esCuadradoMagico = false;
                break;
            }
        }

        // Verificar que la segunda diagonal tenga la misma suma
        if (sumaDiagonalPrincipalDos != sumaReferencia) {
            esCuadradoMagico = false;
        }

        if (esCuadradoMagico) {
            System.out.println("Es un cuadrado mágico");
        } else {
            System.out.println("No es un cuadrado mágico");
        }

        System.out.println("El numero mayor es: " +  numeroMayor);
        System.out.println("Se repite: " +  numeroVecesRepetidasNumeroMaryor +  " veces");
        System.out.println("Los numeros primos son " + numerosPrimos);
        System.out.println("Los numeros pares son " + numerosPares);
        System.out.println("Suma diagonal principal uno es: " + sumaDiagonalPrincipalUno);
        System.out.println("Suma diagonal principal dos es: " + sumaDiagonalPrincipalDos);
        System.out.println("Suma de ultima fila es es: " + sumaUltimaFila);

        if(esCuadradoMagico){
            System.out.println("Es cuadrado mágico");
        }else {
            System.out.println("No es cuadrado mágico");
        }

    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos.
        }
        if (numero == 2) {
            return true; // El número 2 es primo.
        }
        if (numero % 2 == 0) {
            return false; // Los números pares mayores a 2 no son primos.
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) { // Verificamos solo divisores impares.
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}