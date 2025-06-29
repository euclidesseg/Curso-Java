package Clases;

public class VehiculoFurgoneta extends Vehiculo{

    private int carga;
    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga){
        super(matricula,marca,modelo);
        this.carga = carga;
    }

    public int getCarga(){
        return this.carga;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + this.matricula + "\nMarca: " + this.marca +  "\nModelo: "+ this.modelo + "\nCarga: " + this.carga;

    }
}
