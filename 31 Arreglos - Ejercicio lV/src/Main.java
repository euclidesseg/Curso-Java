import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Leer por teclado dos arreglos y mezclarlos en un nuevo arreglo, la mezcla se hará intercalando los valores entre si*/

        Scanner entrada = new Scanner(System.in);
        int[] a = new int[2];
        int[] b = new int[2];
        int[] c = new int[4];

        for (int i = 0; i < 2; i ++){
            System.out.print("Ingrese el valor " + (i + 1) +" del arreglo a");
            int numeroI = entrada.nextInt();
            a[i] = numeroI;
        }
        for (int j = 0; j < 2; j ++){
            System.out.print("Ingrese el valor " + (j +1) +" del arreglo b");
            int numeroJ = entrada.nextInt();
            b[j] = numeroJ;
        }

        int l = 0;
        for (int k = 0; k < 2; k ++) {
            c[l] = a[k];
            l ++;
            c[l] = b[k];
            l ++;
        }
        for (int i : a) {
            System.out.print(i + ",");
        }
        for (int j: b){
            System.out.print(j + ",");
        }

        for (int k : c){
            System.out.print(k + ",");
        }
    }
}
