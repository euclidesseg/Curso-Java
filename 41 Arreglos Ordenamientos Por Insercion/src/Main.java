public class Main {
    public static void main(String[] args) {

        // La idea de este algoritmo de ordenación consiste en ir insertando un
        // elemento de la lista ó un arreglo en la parte ordenada de la misma,
        // asumiendo que el primer elemento es la parte ordenada,

        int [] numeros = {5,3,1,2,4,10,50,31,42};
        for (int numero : numeros){
            System.out.print(numero + " ");
        }

        //Ordenamiento por insercion.
        int posicionActual;
        int numeroevaluado;

        for (int i = 0; i < numeros.length - 1; i++) {
            posicionActual = i;
            numeroevaluado = numeros[i];

            while ((posicionActual > 0) && (numeros[posicionActual - 1] > numeroevaluado)){ //numeros[anterior - 1] > aux:  comprueba si el valor en la posición anterior - 1 del arreglo es mayor que el valor actual aux.
                numeros[posicionActual] = numeros[posicionActual - 1];
                posicionActual --;
            }
            numeros[posicionActual] = numeroevaluado;
        }

        System.out.println("\n \nOrdenado");
        for (int numero : numeros){
            System.out.print(numero + " ");
        }
    }
}

// Descripción del comportamiento del bucle:
//
// Primera iteración del bucle externo (i = 0):
// - El arreglo inicial es {5, 3, 1, 2, 4, 10, 50, 31, 42}.
// - `posicionActual = i = 0`.
// - El bucle `while` no se ejecuta porque posicionActual > 0 no se cumple.
// - El arreglo permanece igual: {5, 3, 1, 2, 4, 10, 50, 31, 42}.
//
// Segunda iteración del bucle externo (i = 1):
// - El arreglo es {5, 3, 1, 2, 4, 10, 50, 31, 42}.
// - `posicionActual = i = 1`, `numeroevaluado = numeros[1] = 3`.
// - En el bucle `while`:
//     - Comprueba si `numeros[0] > 3` (5 > 3), es verdadero.
//     - Desplaza `numeros[0]` a la posición `numeros[1]`.
//     - Decrementa posicionActual: `posicionActual = 0`.
// - Inserta `numeroevaluado` (3) en `numeros[0]`.
// - El arreglo es ahora: {3, 5, 1, 2, 4, 10, 50, 31, 42}.
//
// Tercera iteración del bucle externo (i = 2):
// - El arreglo es {3, 5, 1, 2, 4, 10, 50, 31, 42}.
// - `posicionActual = i = 2`, `numeroevaluado = numeros[2] = 1`.
// - En el bucle `while`:
//     - Comprueba si `numeros[1] > 1` (5 > 1), es verdadero.
//     - Desplaza `numeros[1]` a `numeros[2]`.
//     - Comprueba si `numeros[0] > 1` (3 > 1), es verdadero.
//     - Desplaza `numeros[0]` a `numeros[1]`.
//     - Decrementa posicionActual: `posicionActual = 0`.
// - Inserta `numeroevaluado` (1) en `numeros[0]`.
// - El arreglo es ahora: {1, 3, 5, 2, 4, 10, 50, 31, 42}.
//
// Cuarta iteración del bucle externo (i = 3):
// - El arreglo es {1, 3, 5, 2, 4, 10, 50, 31, 42}.
// - `posicionActual = i = 3`, `numeroevaluado = numeros[3] = 2`.
// - En el bucle `while`:
//     - Comprueba si `numeros[2] > 2` (5 > 2), es verdadero.
//     - Desplaza `numeros[2]` a `numeros[3]`.
//     - Comprueba si `numeros[1] > 2` (3 > 2), es verdadero.
//     - Desplaza `numeros[1]` a `numeros[2]`.
//     - Decrementa posicionActual: `posicionActual = 1`.
// - Inserta `numeroevaluado` (2) en `numeros[1]`.
// - El arreglo es ahora: {1, 2, 3, 5, 4, 10, 50, 31, 42}.
//
// Quinta iteración del bucle externo (i = 4):
// - El arreglo es {1, 2, 3, 5, 4, 10, 50, 31, 42}.
// - `posicionActual = i = 4`, `numeroevaluado = numeros[4] = 4`.
// - En el bucle `while`:
//     - Comprueba si `numeros[3] > 4` (5 > 4), es verdadero.
//     - Desplaza `numeros[3]` a `numeros[4]`.
//     - Decrementa posicionActual: `posicionActual = 3`.
// - Inserta `numeroevaluado` (4) en `numeros[3]`.
// - El arreglo es ahora: {1, 2, 3, 4, 5, 10, 50, 31, 42}.
//
// Iteraciones posteriores:
// - Se repite el proceso, desplazando e insertando elementos hasta que todo el arreglo quede ordenado.