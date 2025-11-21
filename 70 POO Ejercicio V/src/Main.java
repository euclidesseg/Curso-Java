import Clases.Desarrollador;
import Clases.Designer;
import Clases.Empleado;
import Clases.Gerente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static  Scanner scanner = new Scanner(System.in);
    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    public record DatosEmpleado(String nombre, String id, double salarioBase){};

    public static void main(String[] args) {

        contratarEmpleado();
        mostrarEmpleados(empleados);

    }
    public static void contratarEmpleado(){
        int option;
        String respuesta;
        do {
            do {
                option = Integer.parseInt(JOptionPane.showInputDialog("¿Qué empleado desea contratar?\nDiseñador: 1 \nDesarrollador: 2\nGerente: 3"));

                switch (option){
                    case 1: contratarDesigner();
                        break;
                    case 2: contratarDesarrollador();
                        break;
                    case 3:contratarGerente();
                        break;
                }
            }while (option <1 || option > 3);

            System.out.println("¿Desea contratar otro empleado? \nS:Si\nN:No");
            respuesta = scanner.next();
        }while(respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("s"));



    }
    public static void contratarDesigner(){
        DatosEmpleado empleado = pedirDatos();
        String herramienta = JOptionPane.showInputDialog("Con que herramienta trabajará este diseñador");
        Designer designer = new Designer(empleado.nombre,empleado.id, empleado.salarioBase,herramienta);
        empleados.add(designer);
    }
    static void contratarDesarrollador(){
        DatosEmpleado empleado = pedirDatos();
        String lenguaje = JOptionPane.showInputDialog("Con que lenguaje trabajará este desarrollador");
        int yearsExperience = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años de experiencia tiene este desarrollador?"));
        Desarrollador desarrollador = new Desarrollador(empleado.nombre,empleado.id, empleado.salarioBase,yearsExperience, lenguaje);
        empleados.add(desarrollador);
    }
    public static void contratarGerente(){
        DatosEmpleado empleado = pedirDatos();
        int personasACargo = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos personas tendrá a cargo?"));
        Gerente gerente = new Gerente(empleado.nombre,empleado.id, empleado.salarioBase,personasACargo);
        empleados.add(gerente);
    }

    public static DatosEmpleado pedirDatos(){
        String nombre = JOptionPane.showInputDialog("Por favor indique el nombre del empleado seleccionado");
        String DNI = JOptionPane.showInputDialog("Ingrese la identificación del empleado");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base del empleado"));
        DatosEmpleado empleado1 = new DatosEmpleado(nombre, DNI, salario);
        return empleado1;
    }

    public static void mostrarEmpleados(ArrayList<Empleado> empleados){
        for (Empleado empleado: empleados){
            System.out.println(empleado.toString());
            System.out.println("Salario: " + empleado.calcularSalario());
            System.out.println("\n");
        }
    }
}