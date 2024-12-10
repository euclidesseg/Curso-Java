import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Un bucle while permite repetir la ejecución de un grupo de instrucciones mientras se cumpla una condición (es decir,
            mientras la condición tenga un valor True)
            Nota: Si la condición no se cumple no se ejecuta ni siquiera una vez.
        */
        int iterador = 1;
        // Imprimir los números de forma ascendente
        while(iterador <= 10){
            System.out.print(iterador + ", ");
            iterador ++;
        }

        //escribir los números de forma descendiente
        iterador = 10;
        while(iterador >= 1){
            System.out.print(iterador + ", ");
            iterador --;
        }

        int contador;
        int i = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n Por favor Ingrese la cantidad de números que desea ver en pantalla ");
        contador = entrada.nextInt();

        while (i <= contador){
            System.out.println(i);
            i += 5;
        }
    }
}