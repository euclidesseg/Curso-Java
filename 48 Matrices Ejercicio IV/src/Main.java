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
        int nFilas = 5;
        int nColumnas = 5;
        int[][] matriz = new int[nFilas][nColumnas];
        float primedio = 0f;
        int suma_matriz = 0;
        int numeroMayor = 0;
        int numeroVecesRepetidasNumeroMaryor = 1;

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                matriz[i][j] = (int) (Math.random() * 100 ) +1;
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
        primedio = (float) suma_matriz / (nFilas * nColumnas);
        System.out.println("El promedio de esta matriz es: " + primedio);

        // Mostrar el número mayor
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                if (numeroMayor < matriz[i][j]){
                    numeroMayor = matriz[i][j];
                }else if(numeroMayor == matriz[i][j]){
                    numeroVecesRepetidasNumeroMaryor ++;
                }
            }
        }

        System.out.println("El numero mayor es: " +  numeroMayor);
        System.out.println("Se repite: " +  numeroVecesRepetidasNumeroMaryor +  " veces");

    }
}