public class Main {

    /*  Cuando un programa en java viola las restricciones semánticas del lenguaje (se produce un error),
    *   la máquina virtual java comunica este error al programa mediante una excepción
    *
    *   Es decir, que una excepción es un error que se produce durante el tiempo de ejecución de un programa,
    *   muchas clases de errores pueden provocar una excepción desde un desbordamiento de memoria o un disco roto, un
    *   intento de dividir por cero o intentar acceder a un vector fuera de sus límites cuando esto ocurre la máquina virtual de java crea
    *   un objeto de la clase exception
    *
    *   Nota: Si no hay una excepción declarada Tódo lo que exista luego del error no se ejecutará, por lo que la función de las excepciones
    *   es permitir que tu programa evada esos errores, y desde luego notificarlos*/


    public static void main(String[] args) {
        int numero1 = 5, numero2 = 0;

        int resultado = (numero1/numero2);
        System.out.println(resultado);
        System.out.println("Excepciones");
    }
}