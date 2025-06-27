import com.sun.source.tree.WhileLoopTree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    /*  En Java, todas las excepciones son objetos que heredan de la clase Throwable,
    *   y esta a su vez es hija de la clase Object (Clase principal de java).
    *   La jerarquía principal se divide en dos ramas:
    *   Exception (Excepciones verificadas)
    *   Error (Errores graves del sistema o JVM)
    *
    *   Object (Clase principal de java)
    *       |
    *   Throwable
    *       |
    *       |---Exception
    *       |   |----IOException  (Excepciones verificádas)
    *       |   |    | -- FileNotFoundException: intentar acceder a una dirección de archivo que no existe
    *       |   |    |
    *       |   |    |
    *       |   |----RuntimeException (Excepciones no verificádas): dividir por 0, agregar elemento a la posicion 7 de un array el cual tiene 5 posiciones
    *       |   |    |----NullPointerException
    *       |   |    |----ArithmeticException
    *       |   |    |----ArrayIndexOutOfBoundsException
    *       |---Error (Errores del sistema hardware)
    *       |   |
    *       |   |----OutOfMemoryError
    *       |   |----StackOverflowError
    * */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Excepciones verificadas
        // estas excepciones son de software
        String linea;

        try {
            BufferedReader bf = new BufferedReader(new FileReader("files\\text-file.txt"));
            while((linea = bf.readLine()) != null){
                System.out.println(linea);
            }
        }catch (IOException ioException){
            System.out.println("Ha sucedido un error leyendo el archivo, por favor verifica su existencia \n" + ioException.getMessage());
        }

        // Excepciones no verificadas (RuntimeException)
        // Las excepciones verificadas se refieren a que es un error del programador que se presenten estas excepciones
        int numero1 = 5, numero2 = 0;

        try {
            int resultado = (numero1/numero2);
            System.out.println(resultado);
        }catch (ArithmeticException arithmeticException){
            System.out.println("\nNo se puede dividir por 0 \n"+arithmeticException.getMessage());
        }

    }
}