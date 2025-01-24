import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
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
          */

        int size = 30;
        int[] calificaciones = new int[size];
        double media;
        int contador_calificaciones = 0;
        float suma_califiaciones = 0f;
        double mediana;
        double varianzaPoblacional;
        double varianzaMuestral;
        double desviacion;


        // hallar el promedio o media
        for (int i = 0; i < size; i ++){
            int random = (int) (Math.random()*((100 - 1) +1) +1);
            calificaciones[i] = random;
            suma_califiaciones += random;
            contador_calificaciones ++;
        }
        media = suma_califiaciones/contador_calificaciones;

        // ordenar el arreglo
        for(int i = 0; i < calificaciones.length - 1; i ++){
            for (int j = 0; j<(calificaciones.length - 1 - i); j ++){
                if(calificaciones[j] > calificaciones[j+1]){
                    int aux = calificaciones[j];
                    calificaciones[j] = calificaciones [j + 1];
                    calificaciones[j+1] = aux;
                }
            }
        }
        System.out.println();
        for (int calificacion : calificaciones){
            System.out.print( calificacion + " ");
        }

        // hallar la mediana
        if(contador_calificaciones % 2 == 0){
            mediana = (double)((calificaciones[size/2 -1]) + (calificaciones[size/2])) /2;
        }else{
            mediana = ((calificaciones[calificaciones.length / 2]));
        }



        // hallar la moda
        HashMap<Integer, Integer> frecuencia = new HashMap<>(); // Guarda el numero como clave y su frecuencia como valor

        // Contar las frecuencias
        for (int calificacion : calificaciones) {
            frecuencia.put((int)calificacion, frecuencia.getOrDefault(calificacion, 0) + 1); // getOrDefault obtiene el el valor asociado a la clave calificacion si la calificacion no está lo agrega y lo aumenta en 1 si ya está actualiza la frecuancia aumentando en 1
        }

        // Encontrar el número con la frecuencia más alta
        HashMap<Integer, Integer> modas = new HashMap<>();
        float maxFrecuencia = 0f;

        for (Map.Entry<Integer, Integer> entrada : frecuencia.entrySet()) { //entri set devuelve un arreglo con cada par clave valor [3=1, 4=2, 8=2, 24=1, 48=1, 64=2, 97=1,.....]
            if (entrada.getValue() > maxFrecuencia) {
                maxFrecuencia = entrada.getValue();
            }

        }
        for (Map.Entry<Integer, Integer> entrada : frecuencia.entrySet()) {
          if(entrada.getValue() == maxFrecuencia){
              modas.put(entrada.getKey(), entrada.getValue());
          }

        }

        /*
            El Map.Entry entrada, representa un par clave-valor dentro del mapa frecuencia. Tiene dos métodos principales:
            getKey(): Devuelve la clave.
            getValue(): Devuelve el valor asociado a esa clave.
        */

        //restar la media a cada dato para hallar la varianza

      double sumaDiferencias = 0;
        for(int calificacion : calificaciones){
            double diferencia = calificacion - media;
            sumaDiferencias += Math.pow(diferencia,2);
        }

        varianzaPoblacional = sumaDiferencias/(size);
        varianzaMuestral = sumaDiferencias/(size-1);



        desviacion =  Math.sqrt(varianzaPoblacional);



        // Calculo probabilidades
        double countdMayor70 = 0;
        double countEntre50y70 = 0;
        double probabilidadMayor70 = 0;
        double probabilidadEntre50y70 = 0;

        for (int calificacion: calificaciones){
            if (calificacion > 70){
                countdMayor70 ++;
            }
            if(calificacion >=50 && calificacion <= 70){
                countEntre50y70 ++;
            }
        }
        probabilidadMayor70 = countdMayor70/size*100;
        probabilidadEntre50y70 = countEntre50y70/size*100;


        // Imprimir los resultados
        System.out.println("\nLa media de las calificaciones es " + media);
        System.out.println("La mediana es " + mediana);
        System.out.println("La moda es: " + modas);
        System.out.println("Se repiten " + maxFrecuencia + " veces.");
        System.out.println("La varianza poblacional es: " + varianzaPoblacional);
        System.out.println("La varianza muestral es: " + varianzaMuestral);
        System.out.println("La desviación es: " + desviacion);
        System.out.println("la probabilidad de que se tome una calificacion mayor a 70 es de: " + probabilidadMayor70 + "%");
        System.out.println("la probabilidad de que se tome una calificacion entre 50 y 70 es de: " + probabilidadEntre50y70 + "%");

        /*Diferencias entre varianza poblacional y varianza muestral

        Poblaclional: Se calcula cuando se tiene acceso a todos los datos de una poblacion paar este caso se divide la suma de las diferencias cuadradas
        por el tamaño total de la poblacion

        Muestral: Se calcula cuando se trabaja con una muestra extraida de la poblacion se divide la suma de las diferencias cuadradas por n-1 siendo n el tamaño de la muestra.
        */
    }
}