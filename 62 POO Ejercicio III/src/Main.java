import Clases.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroTriangulos;
        System.out.println("Por favor ingrese el numero de triangulos que desea almacenar");
        numeroTriangulos = entrada.nextInt();


        Triangulo triangulos[] = new Triangulo[numeroTriangulos];

        for (int i = 0; i < triangulos.length ; i++) {
            double ladoUno;
            double ladoDos;
            System.out.println("Ingrese el lado 1 del triangulo: " + (i + 1) );
            ladoUno = entrada.nextDouble();
            System.out.println("Ingrese el lado 2 del triangulo" + (i + 1));
            ladoDos = entrada.nextDouble();

            Triangulo triangulo = new Triangulo(ladoUno, ladoDos);
            triangulo.setArea();
            triangulo.setPerimetro();

            triangulos[i] = triangulo;
        }

        System.out.println("Las dimensione del mayor triangulo son:");
        System.out.println("Area: " +  trianguloMayorPerimetro(triangulos).getArea());
        System.out.println("Perimetro: " +  trianguloMayorPerimetro(triangulos).getPerimetro());

    }
    public static Triangulo trianguloMayorPerimetro(Triangulo[] triangulos){
            Triangulo mayor = triangulos[0];
            for (int i = 1; i < triangulos.length; i++) {
                if (triangulos[i].getPerimetro() > mayor.getPerimetro()) {
                    mayor = triangulos[i];
                }
            }
            return mayor;
    }
}