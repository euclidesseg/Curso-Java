import Clases.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Euclides", 27);
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
    }
}