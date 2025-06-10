import Clases.Estatico;

public class Main {
    public static void main(String[] args) {
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();


        /*
        *   Cuando creamos un objeto este objeto toma una copia de todos
        *   Los atributos que no sean estaticos de la clase
        *
        *   Cuando un atributo es estatico tódo cambio que se la haga a dicho atributo
        *   será el el mismo para todos los objetos instanciados con esa calse
        *
        *   Otra caracteristicas de estos atributos es que no requieren de un objeto
        *   para acceder a ellos dato que son propiedad de la clase y no de objetos
        *   se accede con Clase.atributo
        * */
        ob2.frase = "Segunda frase";
        Estatico.frase = "Tercera frase";

        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        System.out.println("La suma es " + Estatico.sumar(2,6));
    }
}