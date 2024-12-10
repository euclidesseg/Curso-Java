import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Para introducir datos mediante el teclado en java, usamos la librería Scanner de java mediante un objeto

        Scanner entrada = new Scanner(System.in);
       int entero;
       float flotante;
       String cadena;
       double numeroGrande;
        char letra;
        System.out.print("Digite un numero entero ");
        entero = entrada.nextInt();

        System.out.print("Digite un numero flotante ");
        flotante = entrada.nextFloat();

        System.out.print("Digite una cadena ");
        cadena = entrada.next();

        System.out.print("Dijiste un numero grande ");
        numeroGrande = entrada.nextDouble();

        System.out.print("Digite una letra ");
        letra = entrada.next().charAt(0);

        System.out.println(entero);
        System.out.println(flotante);
        System.out.println(cadena);
        System.out.println(numeroGrande);
        System.out.println(letra);

    }
}