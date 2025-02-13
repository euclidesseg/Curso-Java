package Clases;

public class Coche {
    //Propiedades // conjunsot de caracteriticas que definiran a los objetos de esta clase
    String color;
    String marca;
    int km;

    public static void main(String[] args){
        //creacion de objeto, ahora este objeto contiene los atributos de COche
        Coche coche = new Coche();
        coche.color = "Blanco";
        coche.marca = "Audi";
        coche.km = 0;

        System.out.println("El color del coche es: " + coche.color);
        System.out.println("La marca del coche es: " + coche.marca);
        System.out.println("El kilometrage del coche es: " + coche.km);

        Coche coche2 = new Coche();
        coche2.color = "Azul";
        coche2.marca = "Ford";
        coche2.km = 10;
        System.out.println(" ");

        System.out.println("El color del coche 2 es: " + coche2.color);
        System.out.println("La marca del coche 2 es: " + coche2.marca);
        System.out.println("El kilometrage del 2 coche es: " + coche2.km + " km");
    }
}
