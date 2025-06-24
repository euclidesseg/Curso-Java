import Clases.Poligono;
import Clases.Rectangulo;
import Clases.Triangulo;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    public static void main(String[] args) {
        /*  Hacer un programa para calcular el área de polígonos triángulos rectángulos, el programa debe ser capaz
        *   de almacenar en un arreglo N triángulos y rectángulos y al final mostrar el área y los datos de cada uno
        *   Para ello se tendrá lo siguiente:
        *
        *   Una super clase llamada poligono
        *   Una subclase llamada Rectagngulo
        *   y una subclase llamada triángulo*/

        llenarPoligono();
        mostrarResultados(poligonos);

    }

    public static void llenarPoligono(){
        int option;
        String respuesta;
        do{
            do {
                System.out.println("Indique que polígono desea");
                System.out.println("1. Triángulo");
                System.out.println("2. Rectángulo");
                option = entrada.nextInt();
            }while(option <1 || option > 2);
            switch (option){
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRectangulo();
                    break;

            }
            System.out.println("¿Desea introducir otro polígono?.\n S: si \n N no ");
            respuesta = entrada.next();
        }while(respuesta.equals("S") || respuesta.equals("s"));
    }

    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.println("Ingrese el lado 1 del triangulo");
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese el lado 2 del triangulo");
        lado2 = entrada.nextDouble();
        System.out.println("Ingrese el lado 3 del triangulo");
        lado3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        poligonos.add(triangulo);
    }

    public static void llenarRectangulo(){
        double lado1, lado2;
        System.out.println("Por favor ingrese el lado 1 del rectangulo");
        lado1 = entrada.nextDouble();
        System.out.println("Por favor ingrese el lado 2 del rectangulo");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        poligonos.add(rectangulo);
    }

    public static void mostrarResultados(ArrayList<Poligono> poligonos){
        for (Poligono poligono: poligonos){
            System.out.println(poligono.toString());
            System.out.println("Área:\n" + poligono.area());
        }
    }
}