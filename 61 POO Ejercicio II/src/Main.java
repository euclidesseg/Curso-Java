import Clases.Vehiculo;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int numeroVehiculos;
        Vehiculo[] vehiculos;

        numeroVehiculos = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite la cantidad de vehiculos que desea introducir"));

        vehiculos = new Vehiculo[numeroVehiculos];
        for (int i = 0; i < numeroVehiculos; i++) {
            String marca = JOptionPane.showInputDialog("Digije la marca del vehiculo");
            String modelo = JOptionPane.showInputDialog("Digite el modelo del vehiculo");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Dijite el precio del vehiculo"));

            Vehiculo vehiculo = new Vehiculo(marca,modelo,precio);
            vehiculos[i] = vehiculo;
        }
        Vehiculo vehiculoMasEconomico = getVehiculoConPrecioMenor(vehiculos);

        System.out.println(vehiculoMasEconomico.getMarca());
        System.out.println(vehiculoMasEconomico.getModelo());
        System.out.println(vehiculoMasEconomico.getPrecio());

    }
    static Vehiculo getVehiculoConPrecioMenor(Vehiculo[] vehiculos){
        double precioMenor = Double.MAX_VALUE;
        for (Vehiculo vehiculo: vehiculos){
            if (vehiculo.getPrecio() < precioMenor){
                precioMenor = vehiculo.getPrecio();
            }
        }
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo.getPrecio() == precioMenor){
                return vehiculo;
            }
        }
        return null;
    }
}