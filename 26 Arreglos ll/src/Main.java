import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*LLenado de un arreglo*/
        int cantidadElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos que tendrá el arreglo"));
        char[] letras = new char[cantidadElementos];
        for (int i = 0; i < cantidadElementos; i ++){
            char letra = JOptionPane.showInputDialog("Por favor, ingrese la letra de la posición " +( i + 1)).charAt(0);
            letras[i] = letra;
        }
        for (int i = 0; i < letras.length; i++){
            System.out.print(letras[i]);
        }
    }
}