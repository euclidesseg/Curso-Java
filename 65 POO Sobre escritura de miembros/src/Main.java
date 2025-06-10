import Clases.Aguila;
import Clases.Animal;
import Clases.Ballena;
import Clases.Caballo;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Caballo c = new Caballo();
        Aguila a = new Aguila();
        Ballena b = new Ballena();

        animal.desplazarce();
        c.desplazarce();
        a.desplazarce();
        b.desplazarce();


        /*  En Java la sobre escritura de miembros (sobreescritura de Métodos) es una caracteristica
        *   que permite a una clase hija proporcionar una implementación especifica (diferente) de
        *   un metodo heredado de su clase padre*/

        // Diferencia entre un sobre carga de metodos y sobre escritura de metodos
        //   Sobrecarga de métodos (Overloading)
        /* - No requiere herencia.
         * - Consiste en definir múltiples métodos con el mismo nombre pero diferente número o tipo de parámetros.
         */


        // Sobre escritura de miembros
        /*  - Se da unicamente en contextos de herencia */
        /*  - Cada clase dependiendo de su contexto proporciona una implementación del metodo
        *   - Se usa comúnmente para cambiar o extender el comportamiento heredado*/

    }
}