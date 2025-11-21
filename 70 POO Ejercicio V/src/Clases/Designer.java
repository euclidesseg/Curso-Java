package Clases;

public class Designer extends Empleado{

    private String herramienta;

    public Designer (String nombre, String id, double salarioBase, String herramienta){
        super(nombre, id, salarioBase);
        this.herramienta = herramienta;
    }


    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + (this.getSalarioBase() * 0.03);
    }
    @Override
    public String toString(){
        return "Diseñador: " + super.toString() + "\nHerramienta: " + this.herramienta;
    }
}
