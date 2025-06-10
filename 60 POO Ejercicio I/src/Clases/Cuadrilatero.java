package Clases;

public class Cuadrilatero {
    /*
    *   Construir un programa que calcule el àrea y el perimetro de un cuadrilatero
    *   dada la longitud de dos lados. los valores de la longitud deberan introducirse
    *   por linea de ordenes. Si es un cuadrado sòlo se proporcionarà la longitud
    *   de uno de sus lados al constructor.
    * */

    private float lado1;
    private float lado2;

    // constructor para el caso de cuadrilateros
   public Cuadrilatero(float lado1, float lado2){
       this.lado1 = lado1;
       this.lado2 = lado2;
   }

   // constructor para el caso de cuadrados
   public  Cuadrilatero (float lado1){
       this.lado1 = this.lado2 = lado1;
   }

   public float getPerimetro(){
       return 2* (lado1 + lado2);
   }

   public float getArea(){
       return (lado1 * lado2);
   }

}
