import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*  leer 5 núm,eros por teclado almacenarlos en un arreglo y a continuación realizar la media de los números positivos,
        *   la media de los números negativos y contar el número de ceros*/
        int contadorNegativos = 0;
        double sumaNegativos = 0;
        int contadorPositivos = 0;
        double sumaPositivos = 0;
        int contadorCeros = 0;


        double[] numeros = new double[5];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 5; i ++){
            System.out.println("Ingrese el valor para la casilla " + (i + 1));
            double numero_ingresado =  entrada.nextDouble();
            numeros[i] = numero_ingresado;
        }

        for (double numero:numeros){
            if (numero > 0){
                contadorPositivos ++;
                sumaPositivos += numero;
            }else if(numero < 0){
                contadorNegativos ++;
                sumaNegativos += numero;
            }else {
                contadorCeros ++;
            }
        }

        System.out.print("Los valores del arreglo son: \n");
        for (double numero: numeros){
            System.out.print(numero + ", ");
        }

        System.out.print("La cantidad de valores positivos son " + contadorPositivos + "\n");
        System.out.print("El promedio de los valores positivos es " + (sumaPositivos / contadorPositivos) + "\n");
        System.out.print("La cantidad de valores negativos son " + contadorNegativos +"\n");
        System.out.print("El promedio de los valores negativos es " + (sumaNegativos / contadorNegativos) +"\n");
        System.out.print("La cantidad de ceros es  " + contadorCeros +"\n");


    }
}