//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*  En java un arreglo o vector en java es una estructura de datos que nos permite almacenar (datos)
            de un mismo tipo el tamaño del vector se declara en un primer momento y no puede cambiar durante
            la ejecución del programa

            Sintaxis
            Tipo_de_dato[] nombre_del_vector = new Tipo_de_dato[tamaño]
        */
        int[] numeros = new int[3];
        numeros[0] = 5;
        numeros[1] = 9;
        numeros[2] = 2;

        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + ",");
        }
    }
}