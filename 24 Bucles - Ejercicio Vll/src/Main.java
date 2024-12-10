import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*  Dadas 6 notas, escribir la cantidad de alumnos aprobados (mayor o igual a 5), condicionados (=4) y suspensos
            menor o igual a 3*/

        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;
        float nota = 0;
        for(int i = 6; i >= 1; i --){
            nota = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese una nota entre 0 y 10"));
            if(nota >= 5){
                aprobados ++;
            }else if(nota == 4) {
                condicionados ++;
            }else{
                suspensos ++;
            }

        }
        JOptionPane.showMessageDialog(null, "El numero de aprobados es " + aprobados);
        JOptionPane.showMessageDialog(null, "El numero de condicionados  " + condicionados);
        JOptionPane.showMessageDialog(null, "El numero de suspensos es " + suspensos);

    }
}