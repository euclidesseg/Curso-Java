package Clases;

public class Desarrollador extends Empleado {

    private int years;
    private String lenguaje;

    public Desarrollador(String nombre, String id, double salarioBase, int years, String lenguaje){
        super(nombre, id, salarioBase);
        this.years = years;
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + (this.getSalarioBase() * 0.05);
    }

    @Override
    public String toString() {
        return "Desarrollador: " + super.toString() +"\nLenguaje "+ this.lenguaje;
    }
}
