import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* La sentencia switch en java es una sentencia que permite ejecutar diferentes bloques de código basados
            en el valor de una expresión. Se utiliza principalmente cuando se tienen multiples condiciones que verificar.
        * */

        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite un numero entre 1 y 10"));


        switch(dato){
            case 1: JOptionPane.showMessageDialog(null,"El numero es 1");
                break;
            case 2: JOptionPane.showMessageDialog(null, "El numero es 2");
                break;
            case 3: JOptionPane.showMessageDialog(null, "El numero es 3");
                break;
            case 4: JOptionPane.showMessageDialog(null, "El numero es 4");
                break;
            case 5: JOptionPane.showMessageDialog(null, "El numero es 5");
                break;
            case 6: JOptionPane.showMessageDialog(null, "El numero es 6");
                break;
            case 7: JOptionPane.showMessageDialog(null, "El numero es 7");
                break;
            case 8: JOptionPane.showMessageDialog(null, "El numero es 8");
                break;
            case 9: JOptionPane.showMessageDialog(null, "El numero es 9");
                break;
            case 10: JOptionPane.showMessageDialog(null, "El numero es 10");
                break;
            default: JOptionPane.showMessageDialog(null, "El numero no corresponde a la serie entre 1 y 10, " + dato);
                break;
        }
    }
}