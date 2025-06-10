public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        perro.hacerSonido();

        Estudiante estudiante = new Estudiante("Euclides", "Pérez", 4.5f);
        System.out.println(estudiante.nombre + " " + estudiante.apellido + ", " + "Nota final:" + estudiante.notaFinal);

        Coche c = new Coche(150);
        c.test();
    }
}



/* La palabra reservada super en java se utiliza principalmente en el contexto de herencia entre clases
 * sus usos principales son 3
*/


// 1. Acceder a miembros (variables o métodos) de la superclase

/* Cuando una subclase tiene un campo o
 * Metodo con el mismo nombre que uno en su superclase, se puede usar super para referirse específicamente al de la superclase.
*/

// ==== Ejemplo

class Animal {
    String nombre = "Animal";

    void hacerSonido() {
        System.out.println("Sonido de animal");
    }
}

class Perro extends Animal {
    String nombre = "Perro";

    void imprimirNombre() {
        System.out.println(super.nombre); // Accede a la variable de la superclase
    }

    @Override
    void hacerSonido() {
        super.hacerSonido(); // Llama al metodo de la superclase
        System.out.println("Ladra");
    }
}

// 2. LLamar a un constructor de la clase padre
/*  Dentro del constructor de una clase se puede y a menudo se debe utilizar la palabra super()
*   para invocar un constructor específico de la superclase esto se hace a menudo cuando se inicializan datos desde
*   el constructor de la superclase
*   */

//Enjemplo

class Persona {
    public String nombre;
    public String apellido;

    public  Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

class Estudiante extends Persona{

    public float notaFinal;

    public  Estudiante(String nombre, String apellido, float notaFinal){
        super(nombre, apellido); // nombre y apellido se inicializan para Estudiante desde la superclase
        this.notaFinal = notaFinal;
    }

}

// 3.Pasar el objeto actual como argumento a un metodo de la superclase
/*  Este es un uso menos común, pero válido. Si necesitas pasar la instancia actual (this)
 *  al metodo de la superclase, puedes usar super.algunMetodo(this)
 *  si el metodo espera una referencia de ese tipo.
 * */
 // Ejemplo

class Vehiculo {
    int aceleracion;
    Vehiculo(int aceleracion){
        this.aceleracion = aceleracion;
    }
    void mostrarAceleracion(Vehiculo v){
        System.out.println("Aceleracion: " + v.aceleracion);
    }
}

class Coche extends Vehiculo{
    Coche(int aceleracion){
        super(aceleracion);
    }

    void test(){
        super.mostrarAceleracion(this); // aqui se está usando super y this para enviar la clase actual
    }
}