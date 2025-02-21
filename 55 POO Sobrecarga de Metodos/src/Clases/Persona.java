package Clases;

public class Persona {
    /*  La sobre carga de metodos es la creacion de varios metodos con
    *   el mismo nombre, pero con diferente lista de tipos de parametros
    *   Java utiliza el numero y tipo de parametros para seleccionar cuál definicion
    *   de metodo ejecutar*/


    // Propiedades
    String nombre;
    int edad;
    String dni;

    public Persona(String nombnre, int edad){
        this.nombre = nombnre;
        this.edad = edad;
    }

    // creamos otro metodo con otro parametro // esto es sobrecarga de constructores
    public Persona(String dni){
        this.dni = dni;
    }

    public String mostrarDatos (){
        return "El nombre es " + this.nombre + " \n el id es " + this.dni + " \n La edad es " + this.edad;
    }

    public void correr(){
        System.out.println("Estoy corriendo una maraton");
    }
    public void correr(int km){
        System.out.println("He corrido " + km + " Kilometros");
    }
}
