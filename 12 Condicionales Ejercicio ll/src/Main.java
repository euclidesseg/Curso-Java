import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Determinar si una letra es mayúsculas o no*/

        char letra;
        letra = JOptionPane.showInputDialog("Por favor ingresa una letra").charAt(0);
        if(letra == Character.toLowerCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra " + letra + " Es minúsculas");
        }else if(letra == Character.toUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra " + letra + " Es mayúsculas");
        }else return;
    }
}