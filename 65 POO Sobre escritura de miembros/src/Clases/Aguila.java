package Clases;

public class Aguila extends Animal {

    @Override // indica que este metodo se está sobre escribiendo de su clase padre
    public  void desplazarce(){
        System.out.println("Yo soy un aguila y me desplazo por el aire");
    }

}