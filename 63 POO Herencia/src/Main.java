import Herencia.Estudiante;

/*   La herencia es una forma de reutilización de código, y permite que se puedan definir
 *    nuevas clases a partir de otras ya existentes con el fin de reutilización de código,
 *    generando asi una gerarquía de clases dentro de una aplicación. Si una calse deriva de otra,
 *    esta hereda sus atributos y metodos y puede añadir nuevos atributos, métodos o redefinir los heredados*/
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Euclides","Perez", 28, 152, 4.9f);

        estudiante.mostrarDatos();
    }
}