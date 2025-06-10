import Clases.Cuadrilatero;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Cuadrilatero cuadrilatero1;

        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));

        if(lado1 == lado2){
            cuadrilatero1 = new Cuadrilatero(lado1);
        }else{
            cuadrilatero1 = new Cuadrilatero(lado1, lado2);
        }

        float perimetro = cuadrilatero1.getPerimetro();
        float area = cuadrilatero1.getArea();

        System.out.println("El perímetro es: " +  perimetro);
        System.out.println("El área es: " +  area);

    }
}