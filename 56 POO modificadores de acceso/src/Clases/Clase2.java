package Clases;

public class Clase2 {
    public static void main(String[] args){
        Clase1 objeto1 = new Clase1();

        objeto1.atributoUno = 2;
        //objeto1.atributoDOS = 3; error es privado
        objeto1.atributoTres = 4;
        objeto1.atributoCuatro = 10;
    }
}
