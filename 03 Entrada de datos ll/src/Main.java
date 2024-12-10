import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Escribir datos desde teclado con JoptionPane()

        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero")); // Integer.parseInt para convertir el string de joptionpane a entero
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal"));

        JOptionPane.showMessageDialog(null, "la cadena es " + cadena);
        JOptionPane.showMessageDialog(null, "El entero es " + entero);
        JOptionPane.showMessageDialog(null, "La letra es " + letra);
        JOptionPane.showMessageDialog(null, "El decimal es " + decimal);


    }
}