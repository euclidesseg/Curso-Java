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

        // Bucle externo: iteración a través del arreglo completo
        for (int i = 0; i < numeros.length -1; i++){
            // Bucle interno: compara elementos adyacentes
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


// Como se comporta el metodo?
/*
Primera iteracion bucle interno
j = 0
{45,37,8,17,23,39}
{37,45,8,17,23,39}
j ++

Segunda iteracion bucle interno
j = 1
{37,45,8,17,23,39}
{37,8,45,17,23,39}
j ++

Tercera iteracion bucle interno
j = 2
{37,8,45,17,23,39}
{37,8,17,45,23,39}
j ++

Cuarta iteracion bucle interno
j = 3
{37,8,17,45,23,39}
{37,8,17,23,45,39}
j ++

quinta iteracion bucle interno
j = 4
{37,8,17,23,45,39}
{37,8,17,23,39,45}
j ++

Seguido aumenta en 1 el indice i del bucle externo y se repite el bucle interno
* */
