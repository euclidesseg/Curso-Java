package Clases;

public class Persona {
    /*
     * Sabemos que los datos en Java se dividen en:
     *
     * - **Primitivos**: Representan valores simples y directos en memoria.
     *   (int, char, float, double, boolean, short, byte, long)
     *
     * - **No primitivos**: Son objetos y estructuras más complejas.
     *   (String, arrays [], interfaces, clases)
     *
     * Además, estos datos pueden tener dos comportamientos:
     *
     * - **Variables**: Su valor puede cambiar durante la ejecución del programa.
     * - **Constantes**: Su valor no cambia después de ser asignado.
     *
     */



    // primera constante

    private final String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad  = edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}
