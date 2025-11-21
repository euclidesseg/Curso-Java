package Clases;

public class Gerente extends Empleado{

    private int personas;

    public Gerente (String nombre, String id, double salarioBase, int personas){
        super(nombre, id, salarioBase);
        this.personas = personas;
    }



    @Override
    public double calcularSalario() {
       return this.getSalarioBase() + (this.getSalarioBase() * 0.08);
    }
    @Override
    public String toString() {
        return "Gerente: "+ super.toString()+ "\nPersonas a cargo: " + this.personas;
    }
}
