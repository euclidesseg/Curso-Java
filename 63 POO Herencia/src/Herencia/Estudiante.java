package Herencia;

public class Estudiante extends Persona{

    private int codigoEstudiante;
    private float notaFinal;

    public  Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        // super() indica que no se van a inicializar los atributos:
        // nombre, apellidos y edad, dado que ya se inicializaron en la clase Persona
        super(nombre, apellido,edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Edad:" + this.getEdad() );
        System.out.println("Codigo de estudiante: " + this.codigoEstudiante);
        System.out.println("Nota final: " + this.notaFinal);

    }
}
