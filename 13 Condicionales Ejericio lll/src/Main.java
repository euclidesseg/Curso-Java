import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*En un almacen se hace un 20% de descuento a los clientes cuya compra se igual o supere los 300.000 pesos, cuàl es la cantidad
        * de dinero que pagara un cliente*/

        float valorCompra;
        float valorVentaNeta;

        valorCompra = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese el valor de la compra del cliente"));

        if(valorCompra >= 300000){
            valorVentaNeta = valorCompra - ((20f/100f)*valorCompra);
            JOptionPane.showMessageDialog(null, "Se aplico descuento el valor de la compra del cliente es "+ valorVentaNeta);
        }else{
            valorVentaNeta = valorCompra;
            JOptionPane.showMessageDialog(null, "No se aplico descuento el valor de la compra del cliente es "+ valorVentaNeta);
        }
    }
}