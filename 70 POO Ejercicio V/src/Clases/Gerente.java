package Clases;

public class Gerente extends Empleado{

    private String nombre;
    private String id;
    private double salarioBase;
    private int personas;

    public Gerente (String nombre, String id, double salarioBase, int personas){
        super(nombre, id, salarioBase);
        this.personas = personas;
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
