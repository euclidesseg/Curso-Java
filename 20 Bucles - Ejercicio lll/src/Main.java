import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Leer números hasta que se introduzca un 0, para cada uno indicar si es par o impar*/
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un valor entero"));

        while(numero != 0){

            if (numero % 2 == 0){
                JOptionPane.showMessageDialog(null,"El número " + numero + " Es un numero par");
            }else{
                JOptionPane.showMessageDialog(null,"El número " + numero + " No es un numero par");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un valor entero"));

        }

    }
}