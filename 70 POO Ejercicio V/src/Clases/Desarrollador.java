package Clases;

public class Desarrollador extends Empleado {

    private String nombre;
    private String id;
    private double salarioBase;
    private int years;
    private String lenguaje;

    public Desarrollador(String nombre, String id, double salarioBase, int years, String lenguaje){
        super(nombre, id, salarioBase);
        this.years = years;
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
