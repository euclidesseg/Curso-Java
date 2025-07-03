import javax.swing.*;
import java.io.*;

public class Main {

    public static void leerArchivo() throws FileNotFoundException, IOException {
        File file = new File("file\\fileprueba.txt");
        FileReader fr = new FileReader(file); // en este punto java nos va a decir que se puede producir una excepción de tipo FileNotFoundException
        BufferedReader bf = new BufferedReader(fr); // puede tener excepcion de tipo IOException
        String linea;

        while ((linea = bf.readLine()) != null){
            System.out.println(linea);
        }

        /* cuando pasa esta excepción podemos capturarla en un try catch o declarar la excepción del metodo
         * en este ejemplo hemos usado la declaración de la excepción en el metodo con throws FileNotFoundException
         *
         * Esta forma se usa cuando en el metodo actual no queremos capturar o evitar el error, sino, que el metodo actual
         * lo vamos a usar en un nuevo metodo
         *
         * Nota Se pueden declarar una o más excepciones en el método
        */
    }

    // llamar al metodo anterior y declarar nuevamente las excepciones en el metodo
    public static void leerNuevamente() throws FileNotFoundException, IOException{
        leerArchivo();
    }

    // capturar las excepciones del metodo anterior con try catch
    public static void releerYCapturarConTryCatch(){
        try { // try indica intenta hacer lo siguiente
            // aqui tódo lo que pueda tener una excepción
            leerNuevamente();

        } catch (FileNotFoundException fe) {
            // En caso que suceda un error del tipo FileNotFoundException captúralo con un objeto del tipo de la excepción
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo"+ fe.getMessage());
        }catch (IOException ie){
            // En caso que suceda un error del tipo IOException captúralo con un objeto del tipo de la excepción
            JOptionPane.showMessageDialog(null, "Error capturando el archivo" +  ie.getMessage());
        }finally {
            System.out.println("\nEste finally es opcional y siempre se ejecuta aunque suceda o no una excepción");
        }

        // si se produce una excepción el progama an así va a continuar, dado que la excepción ya se ha capturado.
        System.out.println("Programa terminado");

    }
    public static void main(String[] args) {
        Main.releerYCapturarConTryCatch();
    }
}