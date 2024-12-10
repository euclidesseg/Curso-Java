import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        *  Una compañía de venta de autos usados, paga a su personal de ventas un salario de 1000 dólares mensuales, más una commission de 150
        * dólares pr cada carro vendido, más el 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la computadora
        *  los datos pertinentes hacer un program que calcule em imprima el salario de un vendedor dado.
        */
        Scanner entrada = new Scanner(System.in);

        int dolares = 1000;
        float valorVentaCarro = 10000f;
        float numeroCarros;
        float salario = 1000;
        float salarioNeto;
        String nombreEmpleado;


        System.out.print("Ingrese el nombre del empleado ");
        nombreEmpleado = entrada.next();

        System.out.print("Ingrese cuantos carros vendió este mes el empleado " + nombreEmpleado);
        numeroCarros = entrada.nextInt();

        salarioNeto = salario + (150 * numeroCarros) + ((valorVentaCarro * numeroCarros) * (5/100f));

        System.out.println("El salario neto de "+ nombreEmpleado + "Es de "+ salarioNeto);

    }
}