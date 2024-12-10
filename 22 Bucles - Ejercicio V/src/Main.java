import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Pedir 10 números y escribir la suma total*/
        int canditadNumeros = 10;
        int sumaTotal = 0;

        for (int i = 1; i <= 10; i ++){
            sumaTotal += Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero entero"));
        }
        JOptionPane.showMessageDialog(null, "La suma total es " + sumaTotal);
    }
}