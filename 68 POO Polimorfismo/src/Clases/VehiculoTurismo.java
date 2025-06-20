package Clases;

public class VehiculoTurismo extends Vehiculo {

    private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas){
        super(matricula,marca,modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getPuerta (){
        return  this.numeroPuertas;
    }

    @Override
    public String mostrarDatos() {
        //  sobreescribimos este metodo porque ademas de te3ner matricula, marca y modelo,
        //  tambien tenemos el atributo numeroPuertas
        return "Matricula: " + this.matricula + "\nMarca: " + this.marca +  "\nModelo: "+ this.modelo + "\nNumero puertas:" + this.numeroPuertas;

    }
}
