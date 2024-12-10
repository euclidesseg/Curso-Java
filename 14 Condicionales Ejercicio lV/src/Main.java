import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que simule un cajero automático, el usuario tendrá un saldo inicial de 1000 Dólares */
        /*El usuario podrá realizar las siguientes operaciones*/
        // Retirar dinero
        // Consignar dinero
        // Salir


        double saldoCuenta = 1000;
        int opcion;
        double valorRetiro;
        double valorIngreso;

        opcion =  Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la opción que desea realizar, las opciones disponibles son: \n" +
                " 1. Retirar dinero \n 2. Ingresar dinero \n 0. Salir "));

        switch (opcion){
            case 1:
                valorRetiro = Double.parseDouble(JOptionPane.showInputDialog("Por favor, ingrese el valor que desea retirar"));
                if(valorRetiro > saldoCuenta){
                    JOptionPane.showMessageDialog(null,"El monto de retiro supera al saldo actual de su cuenta. \n " +
                            "Su saldo actual es de " + saldoCuenta);
                }else{
                    saldoCuenta -= valorRetiro;
                    JOptionPane.showMessageDialog(null, "Retiro exitoso, ha retirado " + valorRetiro + " El saldo de su cuenta ahora es " + saldoCuenta);
                }
                break;

            case 2: valorIngreso = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite el valor que desea ingresar a la cuenta"));
                if(valorIngreso > 0 ){
                    saldoCuenta += valorIngreso;
                    JOptionPane.showMessageDialog(null, "Ha depositado " + valorIngreso + " a su cuenta, su nuevo saldo es " + saldoCuenta);
                }else {
                    JOptionPane.showMessageDialog(null, "Para por poder depositar debe ingresar un valor mayor a 0");
                }
                break;

            case 0:
                JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios de cajero automático, por favor, vuelve pronto");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ha ingresado un valor incorrecto ¡Operación finalizada!");
                break;
        }


    }
}