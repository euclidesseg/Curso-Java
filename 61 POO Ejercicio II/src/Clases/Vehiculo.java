package Clases;

public class Vehiculo {
    /*  Construir un programa que dada una seria de vehiculos
    *   caracterizados por su marca,modelo y precio, imprima las propiedades
    *   del vehiculo más barato. Para ello se deberan leer por teclado las caracteristicas de cada vehiculo
    *   y crear una clase que represente a cada uno de ellos*/

    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo (String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public double getPrecio(){
        return this.precio;
    }
}
