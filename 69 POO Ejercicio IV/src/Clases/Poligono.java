package Clases;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados){
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados(){
        return this.numeroLados;
    }
    @Override
    public String toString(){
        return "Numero Lados: " + this.numeroLados;
    }

    public abstract  double area();
}
