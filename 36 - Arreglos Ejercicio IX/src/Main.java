import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*  Escribir un programa que lea un arreglo con calificaciones de estudiantes calcular el promedio de las calificacioens
            e indique cuantos estudiantes tienen la nota mayor al promedio*/

        final int longitud_arreglo = 5;
        double[] calificaciones = new double[longitud_arreglo];
        double promedio = 0;
        int estudiantes_sobresalientes = 0;
        double suma_calificaciones = 0;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < longitud_arreglo; i++){
            double calificacion;
            System.out.print("Por favor ingresa la calificación para la posición "+ (i+1) +" ");
            calificacion = entrada.nextDouble();
            suma_calificaciones += calificacion;
            calificaciones[i] = calificacion;
        }

        promedio = suma_calificaciones / longitud_arreglo;

        for (double calificacion:calificaciones){
            if(calificacion > promedio){
                estudiantes_sobresalientes ++;
            }
        }
        System.out.print("EL promedio de calificaciones es " + promedio);
        System.out.println();
        System.out.print("EL numero de estudiantes sobresalientes es " + estudiantes_sobresalientes);

    }
}