//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        //Condiciones
        /*
        * >
        * <
        * <=
        * >=
        * ==
        * !=
        * */
        int x = 15;
        int y = 16;
        if(y != x){
            System.out.println("Es verdadero");
        }else{
            System.out.println("Es falso");
        }

        //Operadores lógicos
        /*
        * &&  ambas condiciones dentro del if deben ser verdadero para que el resultado sea verdadero
        * ||  al menos una condición debe ser verdadera para que el resultado sea verdadero
        * !   negación de true o false.
        * */

        int a = 1;
        int b = 2;
        int c = 3;
        boolean result = true;
        if(b > a && c > b){
            System.out.println("b es mayor que a y c es mayor que b");
        }
        if(!result){
            System.out.println("Resultado es falso");
        }else{
            System.out.println("Resultado es verdadero");
        }

        //Condiciones anidadas
        if( b < c ){
            System.out.println("b si es menos que c");
        }else if(b > c){
            System.out.println("b es mayor que c");
        }else if(a != c && a != b){
            System.out.println("a es diferente de b y c");
        }
    }
}