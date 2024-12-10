import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Leer un numero e indicar si es positivo o negativo,
           repetir el proceso hasta que se introduzca el número 0*/

        int numero = 1;

        while(numero != 0){
          if (numero > 0){
              JOptionPane.showMessageDialog(null,"El número " + numero + " Es un numero positivo");
          }else{
              JOptionPane.showMessageDialog(null,"El número " + numero + " Es un numero negativo");
          }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un valor entero"));
        }
    }
}