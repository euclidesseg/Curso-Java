package Clases;
/*  Diseñar un programa para trabajar con triangulos isóceles, para ello defina
 *   los atributos necesarios que se requieren, proporcione metodos de consulta, un metodo costructor
 *   e implemente métodos para calcular el perimetro y
 *   y area de un triangulo además implementar un metodo que a partir de un arreglo
 *   de triangulos devuelva el area del triangulo de mayor superficie.
 * */

public class Triangulo {

    private double ladoUno;
    private double ladoDos;
    private double area;
    private double perimetro;

    public Triangulo (double ladoUno, double ladoDos){
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }

    public void setArea() {
        this.area = (ladoUno * ladoDos) / 2;
    }
    public double getArea(){
        return this.area;
    }
    public void setPerimetro(){
        this.perimetro = ladoUno + (ladoDos * 2);
    }

    public double getPerimetro(){
        return this.perimetro;
    }
}
