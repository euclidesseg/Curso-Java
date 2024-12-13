import javax.swing.*;
import java.util.Scanner;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Recibir un arreglo de numeros y multiplicarlo por un escalar almacenar los resultados en nu nuevo arreglo*/

        int[] numeros = {1,2,8,100,10,15,20,0,56,35,29,16};
        Vector<Integer> vector_multiplicado = new Vector<>();
        int escalar = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el escalar (Número) por el cual desea multiplicar el vector dado "));

        for (int i = 0; i < numeros.length; i ++){
            vector_multiplicado.add((escalar * numeros[i]));
        }

        System.out.println("Los valores del vector multiplicado por el escalar " +escalar+" son: ");
        for (int valor:vector_multiplicado) {
            System.out.print(valor + " ");
        }
    }
}