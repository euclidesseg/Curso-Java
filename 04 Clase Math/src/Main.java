//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*
    * La clase Math en java es una clase predefinida que contiene métodos y constantes para realizar operaciones matemáticas
    * comunes, como cálculos de trigonometría, logaritmos, exponentes, raíces, cuadradas entre otros.
    */
        double base = 5;
        double exponente = 3;
        double raiz = Math.sqrt(9);// el sqrt (raíz cuadrada) de la clase math funciona con double
        double potencia = Math.pow(base, exponente);
        double numeroARedondear = 153.6;
        long resultadoLong = Math.round(numeroARedondear); // recibe un argumento  de tipo double
        int resultadoInt = Math.round(1646.2f);   // recibe un argumento de tipo float
        double random = (int) (Math.random() *((100 - 1) + 1) + 1);

        System.out.println(raiz);
        System.out.println(base +" Elevado a la potencia de " + exponente +" Es "+ potencia);
        System.out.println("resultado entero redondeado " + resultadoInt);
        System.out.println("Resultado double redondeado " + resultadoLong);
        System.out.println("Resultado random " + random);
    }
}