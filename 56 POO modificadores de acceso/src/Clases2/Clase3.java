package Clases2;

import Clases.Clase1;

public class Clase3 {
    public static void main(String[] args){
        Clase1 objeto1 = new Clase1();

        objeto1.atributoUno = 2;
        //objeto1.atributoDOS = 3; error es privado
        //objeto1.atributoTres = 4; error protected accesible solo por el paquete y clases hijas
        //objeto1.atributoCuatro = 10; error default accesible solo pro el mismo paquete
    }
}
