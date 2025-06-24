package Clases;

public class Rectangulo extends Poligono {

    private double ladoUno;
    private double ladoDos;

    public Rectangulo(double ladoUno, double ladoDos){
        super(2);
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }

    public double getLadoUno() {
        return ladoUno;
    }

    public double getLadoDos() {
        return ladoDos;
    }

    @Override
    public String toString(){
        return "Rectángulo: \n" + super.toString() + "\n Lado 1 = " + ladoUno + " Lado 2 = " + ladoDos;

    }

    @Override
    public double area() {
        return ladoUno * ladoDos;
    }
}
