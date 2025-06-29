import Clases.*;

public class Main {
    public static void main(String[] args) {
      /*    En java una clase abstracta es una clase que no puede ser instanciada directamente
      *     si no que debe ser extendida por otras clases, para que estas puedan ser instanciadas
      *     Se utiliza para definir un comportamiento comun y obligatorio para otras clases, permitiendo a las
      *     subclases implementar métodos abstractos (sin cuerpo)
      *
      *     - Cuando la clase tiene un metodo abstracto ya se considera una clase abstracta*/


        //SerVivo servivo = new SerVivo(); error no se puede instanciar una clase abstracta
        Planta planta = new Planta();
        planta.alimentarse();

        //Animal animal = new Animal()// error, no se puede instanciar esta es una clase abstracta

        AnimalHerbivoro herbivoro = new AnimalHerbivoro();
        herbivoro.alimentarse();

        AnimalCarnivoro carnivoro = new AnimalCarnivoro();
        carnivoro.alimentarse();

    }
}