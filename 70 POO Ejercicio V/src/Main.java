import Clases.Designer;
import Clases.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Empleado empleados [] = new Empleado[9];

        Designer disenador = new Designer("Abraham","100", 2000,"Photoshop");

       System.out.print(disenador.mostrarInformacion());
    }
}