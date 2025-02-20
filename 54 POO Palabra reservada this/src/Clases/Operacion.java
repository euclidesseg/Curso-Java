package Clases;

import com.sun.tools.jconsole.JConsoleContext;

public class Operacion {
    // ¿Qué es y cómo se usa "this"?
    // Existen 6 formas de usar "this":

    /*  1. Referenciar una variable de instancia de la clase.
     *  2. Invocar un metodo de la clase actual.
     *  3. Invocar otro constructor de la misma clase.
     *  4. Pasarlo como argumento en la llamada a un metodo.
     *  5. Pasarlo como argumento en la llamada a un constructor.
     *  6. Devolver la instancia actual de la clase desde un metodo.
     */

    private String variableUno;
    private String variableDos;




    // Forma 1. referenciar una varible de instancia de la clase
    public Operacion (String variableUno, String variableDos){
        this();
        this.variableUno = variableUno;
        this.variableDos = variableDos;
    }



    public void mostrar(){
        System.out.println("Estas son las variables " +  this.variableUno + " " + this.variableDos);
    }


    // Forma 2. LLamar o invocar un metodo de la misma calse
    public void mostrarMas(){
        this.mostrar();
    }

    // Forma 3 invocar otro  constructor de la misma clase
    public Operacion(){
        this("variable1");
    }
    //podemos crear otro constructor y este llamarlo desde el primer constructor
    public Operacion(String variableUno){
        System.out.println("Tercer constructor");
   }

    // forma 4.pasandolo como argumeto en la llamada de un metodo
    // ahora a mostrar más le mandamos un argumento de la misma clase

    public void recibir(Operacion operacion){
        System.out.println(operacion.variableUno + "  " + operacion.variableDos);
    }
    public void enviar(){
        this.recibir(this);
    }

    // 5. Pasar this como argumento en la llamada a un constructor
    Operacion operacion;
    public Operacion(Operacion operacion){
        this.operacion = operacion;
    }
    public void crearAuxiliar(){
        Operacion operacion1 = new Operacion(this);
    }


    //6 devolver la instancia de la classe
    public Operacion devolverInstancia(){
        return this; // devuelve la instancia más no el constructor
    }
}
