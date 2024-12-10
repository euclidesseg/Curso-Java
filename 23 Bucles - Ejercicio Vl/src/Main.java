import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*Pedir 10 numeros, mostrar la media de los numeros positivos, la media de los numeros negativos y la cantidad de ceros*/

        int sumaPositivos = 0;
        int conteoPositivos = 0;
        int sumaNegativos = 0;
        int conteoNegativos = 0;
        int cantidadCeros = 0;
        int numeroIngresado;

        for (int i = 10; i >= 1; i -- ){
            numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese un número"));
            if (numeroIngresado > 0){
                sumaPositivos += numeroIngresado;
                conteoPositivos ++;
            }else if(numeroIngresado < 0){
                sumaNegativos += numeroIngresado;
                conteoNegativos ++;
            }else{
                cantidadCeros ++;
            }
        }
        JOptionPane.showMessageDialog(null, "Promedio positivos: " + (float) (sumaPositivos / conteoPositivos));
        JOptionPane.showMessageDialog(null, "Promedio negativos: " + (float) (sumaNegativos / conteoNegativos));
        JOptionPane.showMessageDialog(null, "Cantidad de ceros " + cantidadCeros);

    }
}