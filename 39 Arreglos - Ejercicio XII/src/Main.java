import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*  Realizar encuesta a 30 estudiantes sobre su calificación en un examen (valores entre 0 y 100), crear un porograma en Java que haga lo siguiente
            1. Almacenar las calificaciones en un arreglo
            2. Calcular
                la media de las calificaciones
                la mediana
                la moda
                la varianza
                la desviación estandar
            3. Calcula probabilidades
                la probabilidad de que un estudiante haya obtenido una calificación mayor a 70.
                la probabilidad de que un estudiante tenga una calificación entre 50 y 70

            4.  Extra: representár el número de estudiantes por cada rango de calificaciones
          */

        float[] calificaciones = new float[30];
        float media = 0f;
        int contador_calificaciones = 0;
        float suma_califiaciones = 0f;
        float mediana = 0f;
        float moda = 0f;
        float varianza = 0f;
        float desviacion = 0f;


        for (int i = 0; i < 30; i ++){
            int random = (int) (Math.random()*((100 - 1) +1) +1);
            calificaciones[i] = random;
            System.out.print(random + ",");
            suma_califiaciones += random;
            contador_calificaciones ++;
        }
        media = (suma_califiaciones/contador_calificaciones);
        System.out.println("\n La media de las calificaciones es " + media);

        
    }
}