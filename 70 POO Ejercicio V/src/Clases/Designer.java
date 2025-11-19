package Clases;

public class Designer extends Empleado{

    private String nombre;
    private String id;
    private double salarioBase;
    private String herramienta;

    public Designer (String nombre, String id, double salarioBase, String herramienta){
        super(nombre, id, salarioBase);
        this.herramienta = herramienta;
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
