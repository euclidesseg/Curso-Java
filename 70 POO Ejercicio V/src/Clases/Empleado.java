package Clases;

public abstract class Empleado {
    private String nombre;
    private String id;
    private double salarioBase;

    public Empleado(String nombre, String id, double salarioBase){
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String mostrarInformacion(){
        return "Nombre: " + this.nombre + "\nIdentificados: "+ this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getId(){
        return this.id;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }
}
