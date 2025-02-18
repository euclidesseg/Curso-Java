package Clases;

public class Operacion {
      /*  Un Método con retorno de valores en Java es un método
            que devuelve un valor al lugar donde se llama.

            Pueden retornar valores Int,String, double, float, char, boolean, o cualquier clase que le indiquemos
            generalmente estos retornos se almacenan en el lugar donde se llaman
        * */


    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }

    public int restar(int numero1, int numero2){
        return numero1 - numero2;
    }
    public int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }
    public float dividir(float numero1, float numero2){
        return  (numero1/numero2);
    }

}

