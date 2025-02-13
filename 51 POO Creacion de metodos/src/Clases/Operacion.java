package Clases;

import javax.swing.*;

public class Operacion {
    /*  Un metodo se denomina comportamiento de un metodo se compone
    *   de un modificador de acceso casi siempre public
    *   un valor de retorno int String o void si no retorna nada
    *   el nombre del Metodo y un constructor () el cual representa la clase
    * */

    //Propiedades/Atributos

    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos

    // Metodo para pedirle al usuario que digite dos numeros

    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero 1."));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(("Por favor digite el numero dos. ")));
    }

    public void sumar(){
        suma = numero1 + numero2;
    }
    public void restar(){
        resta = numero1 - numero2;
    }
    public void  multiplicar(){
        multiplicacion = numero1 * numero2;
    }
    public void dividir(){
        division = numero1 / numero2;
    }
    public void imprimirResultados(){
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: "+ division);
    }

}
