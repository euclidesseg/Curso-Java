//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Este método es el punto de entrada de nuestro proyecto. El argumento 'String[] args' indica que recibe un arreglo de strings llamado 'args'.
    public static void main(String[] args) {
        // Tipos de variables en Java
        String nombre = "Euclides"; // Cadena de texto (String)
        byte by = -128; // Un byte es una unidad de información de 8 bits, que representa valores enteros entre -128 y 127
        short s = -32768; // Es un entero de 2 bytes (16 bits) con un rango de -32768 a 32767
        int b = -1; // Es un entero de 4 bytes (32 bits)
        long l = -12; // Es un entero de 8 bytes (64 bits), tiene el rango más grande para enteros
        float f = 1.3f; // Ocupa 4 bytes (32 bits) y se usa para números con decimales; lleva una 'f' al final para indicar que es tipo float y no double
        double c = 1.2; // Ocupa 8 bytes (64 bits), se usa para números con decimales de mayor precisión
        boolean d = false; // Almacena valores booleanos (true o false)
        char e = 'f'; // Almacena un solo carácter Unicode, como 'a', 'b', o '1'

        System.out.println("Hola " + nombre); // Imprime "Hola Euclides"

        // Operadores aritméticos
        int resultadoEntero = 1 + 1; // Suma
        int resultadoResta = 1 - 2; // Resta
        int resultadoMul = 4 * 2; // Multiplicación
        int resultadoDiv = 16 / 4; // División
        double modulo = resultadoDiv % resultadoMul; // Módulo, el residuo de la división
        resultadoEntero++; // Incrementa el valor de 'resultadoEntero' en 1
        resultadoResta--; // Decrementa el valor de 'resultadoResta' en 1
        resultadoEntero+=2;

        System.out.println("Módulo = " + modulo); // Imprime el resultado del módulo
        System.out.println(resultadoEntero); // Imprime el valor de 'resultadoEntero'
        System.out.println(resultadoResta); // Imprime el valor de 'resultadoResta'
    }
}