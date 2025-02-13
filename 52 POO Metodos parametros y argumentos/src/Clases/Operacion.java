package Clases;

public class Operacion {
    /*
     *  Tanto los parámetros como los argumentos pertenecen a los métodos y se pueden
     *  identificar de la siguiente manera:
     *
     * - Los parámetros son las variables que se DECLARAN dentro de los paréntesis al definir un método.
     *   Ejemplo:
     *   void sumar(int numero1, int numero2) { ... }
     *
     * - Los argumentos son los valores que se envían al llamar al método.
     *   Ejemplo:
     *   sumar(5, 10);
     */

    int suma,resta,multiplicacion,division;

    public void sumar(int numero1, int numero2){
        suma = numero1 + numero2;
    }
    public void restar(int numero1, int numero2){
        resta = numero1 - numero2;
    }
    public void multiplicar(int numero1, int numero2){
        multiplicacion = numero1 * numero2;
    }
    public void dividir(int numero1, int numero2){
        division = numero1 / numero2;
    }

    public void imprimir(){
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);
    }



}
