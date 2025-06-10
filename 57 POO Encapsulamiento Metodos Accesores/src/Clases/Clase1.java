package Clases;

public class Clase1 {
    /*
     * El encapsulamiento se encarga de privatizar nuestras
     * propiedades y metodos para qeu solamente puedan ser accedidos por los
     * metodos accesores
     * */

    private int edad;

    private String nombre;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
