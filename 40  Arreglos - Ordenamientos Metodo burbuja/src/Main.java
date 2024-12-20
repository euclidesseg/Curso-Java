//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*  Burbuja es un método de ordenamiento de datos usado en los vectores, funciona revisando cada elemento de un vector con el elemento siguiente
            cambiando de posición si están en el orden equivocado. es el algoritmo de ordenamiento más sencillo de programar pero poco eficiente a la hora
            de ordenar cientos o miles de datos
        */

        int[] numeros = {45,37,8,17,23,39};
        for (int numero: numeros){
            System.out.print(numero +" ");
        }
        System.out.println();

        for (int i = 0; i < numeros.length -1; i++){
            for(int j = 0; j < numeros.length -1; j ++){
                if(numeros[j] > numeros[j+1]){
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        for (int numero: numeros){
            System.out.print(numero +" ");
        }
    }
}