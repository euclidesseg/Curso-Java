package Clases;

    /*  El Metodo constructor en Java es un Metodo especial que se invoca al crear una instancia de una clase. Su función principal es inicializar los
        atributos de la clase y prepararla para su uso.

        Cuando se crea un objeto sucede lo siguiente
        1. Se asigna memoria para el objeto
        2. se inicializan los atributos del objeto
        3. se invoca el constructor de la clase que puede ser uno entre varios

       Persona persona = new Persona()
       desde que lleve parentesis ya es un metodo entonces los parentesis
       en un objeto indica que es el metodo constructor.

       caracteristicas

       # Tienene el mismo nombre de la clase
       # No devuelven ningun valor por tanto no se indica valor de retorno
       # Debe declarearse cómo publico

     */

public class Persona {

    // Propiedades
    String nombre;
    int edad;


    // Métodos


    // Metodo constructor
    public Persona(String nombre, int edad){ // pedimos 2 parametros
        this.nombre = nombre;
        this.edad = edad;
        // this hace referencia al atributo que queremos modificar
    }
    public void mostrarDatos(){
        System.out.println("El nombre es " + nombre);
        System.out.println("La edad es " + edad +  " años");
    }
}
