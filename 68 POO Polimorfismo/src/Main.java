import Clases.Vehiculo;
import Clases.VehiculoDeportivo;
import Clases.VehiculoFurgoneta;
import Clases.VehiculoTurismo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /*  El Polimorfismo se refiere a las muchas formas que puede tomar un objeto de una clase es decir,
        *   diferentes comportamientos dependiendo del contexto
        *
        *   Ejemplo
        *   Podemos crear dos clases distintas: Gato y Perro, que heredan de la superclase Animal.
        *   La clase Animal tiene el Metodo abstracto hacerSonido()
        *   que se implementa de forma distinta en cada una de las subclases (gatos y perros suenan de forma distinta).
        *   Entonces, por medio de una instancia de la clase Animal, podemos enviar un mensaje con el sonido a cada subclase (Perro o Gato)
        *   haciendo así un uso polimórfico, es decir, un objeto de la superclase almacena un objeto de cualquiera de sus subclases.
        *
        *   En este ejemplo un objeto de la clase Animal puede tomar la forma de un objeto de la clase Gato
        *   o de la clase Perro
        * */

        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("58SKJ","Ferrary","A89");
        misVehiculos[1] = new VehiculoTurismo("78HJ","AUDI","P14",4);
        misVehiculos[2] = new VehiculoDeportivo("9202GH","Toyota","XZ95",500);
        misVehiculos[3] = new VehiculoFurgoneta("3102YT","Toyota", "51NB",700);


        for (Vehiculo vehiculo: misVehiculos){
            System.out.println(vehiculo.mostrarDatos() + "\n");
        }
    }
}