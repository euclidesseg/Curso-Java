import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int arreglo[] = {1,3,5,2,4};

        int dato;
        boolean band = false;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el dato que quiere buscar"));

        int i = 0;
        while(i < 5 && band == false){
            if(dato == arreglo[i]){
                band = true;
            }
            i ++;
        }

        if(band == false){
            JOptionPane.showMessageDialog(null, "No se ha encontrado el numero ingresado");
        }else{
            JOptionPane.showMessageDialog(null, "Hemos hallado tu numero en la posicion " + (i - 1));
        }
    }
}