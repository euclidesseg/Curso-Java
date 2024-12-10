import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Guillermo tiene N dólares,
        * luis tiene la mitad de lo que posee guillermo,
        * juan tiene la mitad de lo que poseen luis y guillermo,
        * calcule e imprima la cantidad de dinero que tienen entre los 3.
        *
        */

        // L = cantidad de luis
        // l * 2 cantidad de guillermo
        // (l*2 /2 ) + (l/2) = cantidad de Juan
        // todos
        float guillermo;
        float luis;
        float juan;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de Guillermo ");
        guillermo = entrada.nextFloat();

        luis = guillermo / 2;
        juan = (guillermo + luis)/2;

        float total = luis + juan + guillermo;
        System.out.println("En total todos tienen " + total);

    }
}