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

    public static void main(String[] args) {

        contratarEmpleado();

    }
    public static void contratarEmpleado(){
        int option;
        String respuesta;
        do {
            do {
                System.out.println("¿Qué empleado desea contratar?\nDiseñador: 1 \nDesarrollador: 2\nGerente: 3");
                option = scanner.nextInt();
                switch (option){
                    case 1: contratarDesigner();
                        break;
                    case 2: contratarDesarrollador();
                        break;
                    case 3:contratarGerente();
                        break;
                }
            }while (option <1 || option > 3);

            System.out.println("¿Desea contratar otro empleado? \n S:Si\nN:No");
            respuesta = scanner.next();
        }while(respuesta.equals("Si") || respuesta.equals("S") || respuesta.equals("si") || respuesta.equals("s"));



    }
    public static void contratarDesigner(){
        String nombre = JOptionPane.showInputDialog("Por favor indique el nombre del empleado seleccionado");
        String DNI = JOptionPane.showInputDialog("Ingrese la identificación del empleado");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base del empleado"));
        String herramienta = JOptionPane.showInputDialog("Con que herramienta trabajará este diseñador");
        Designer designer = new Designer(nombre,DNI, salario,herramienta);
        empleados.add(designer);
    }
    static void contratarDesarrollador(){
        String nombre = JOptionPane.showInputDialog("Por favor indique el nombre del empleado seleccionado");
        String DNI = JOptionPane.showInputDialog("Ingrese la identificación del empleado");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base del empleado"));
        String lenguaje = JOptionPane.showInputDialog("Con que lenguaje trabajará este desarrollador");
        int yearsExperience = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años de experiencia tiene este desarrollador?"));
        Desarrollador desarrollador = new Desarrollador(nombre,DNI, salario,yearsExperience, lenguaje);
        empleados.add(desarrollador);
    }
    public static void contratarGerente(){
        String nombre = JOptionPane.showInputDialog("Por favor indique el nombre del empleado seleccionado");
        String DNI = JOptionPane.showInputDialog("Ingrese la identificación del empleado");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base del empleado"));
        int personasACargo = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos personas tendrá a cargo?"));
        Gerente gerente = new Gerente(nombre,DNI, salario,personasACargo, (salario*0.03));
        empleados.add(gerente);
    }
}