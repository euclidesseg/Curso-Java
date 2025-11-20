package Clases;

public class Gerente extends Empleado{

    private String nombre;
    private String id;
    private double salarioBase;
    private int personas;
    private double bonificacion;

    public Gerente (String nombre, String id, double salarioBase, int personas, double bonificacion){
        super(nombre, id, salarioBase);
        this.personas = personas;
        this.bonificacion = bonificacion;
    }



    @Override
    public double calcularSalario() {
        double salarioNet = this.getSalarioBase();
        double salarioTotal = salarioNet + this.bonificacion;
        return  salarioTotal;
    }
    @Override
    public String toString() {
        return "Gerente: "+ super.toString() + "\nSalario: " + this.calcularSalario() + "\nPersonas a cargo: " + this.personas;
    }
}
