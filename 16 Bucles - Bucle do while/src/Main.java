import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*  La estructura repetitiva do while es aquella en que el cuerpo del bucle se repite mientras se cumple una determinada condición
            Nota: La diferencia entre while y do while, es que en el bucle do while, siempre se van a ejecutar sus instrucciones al menos una ves, esto
            debido a que la condición se evalúa al terminar las instrucciones del bloque.
        * */

        int i = 1;
        do {
            System.out.println(i);
            i ++;
        }while(i <= 10);

        int iterador;
        i = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas veces desea repetir el contador");
        iterador = entrada.nextInt();

        do {
            System.out.print(i + ", ");
            i ++;
        }while(i <= iterador );


    }
}