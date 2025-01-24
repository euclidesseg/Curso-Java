import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroHoras;
        System.out.println("Ingrese el número de horas ");
        numeroHoras = entrada.nextInt();

        int semanas = numeroHoras/168;
        int dias = (numeroHoras % 168)/24;
        int horas =  numeroHoras%24;
        //Nota: Ya que los datos fueron suministrados en horas, también serán operados en horas
        System.out.println("En total hay " + semanas+ " Semanas " + dias + " dias " + horas +" horas" );
    }
}