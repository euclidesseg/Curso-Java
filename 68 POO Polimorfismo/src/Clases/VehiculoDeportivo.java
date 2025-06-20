package Clases;

public class VehiculoDeportivo extends Vehiculo{

    private int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada){
        super(matricula,marca,modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return this.cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + this.matricula + "\nMarca: " + this.marca +  "\nModelo: "+ this.modelo + "\nCilindrada:" +
                this.cilindrada;

    }
}
