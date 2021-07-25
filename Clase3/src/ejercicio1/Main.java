package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cantidad de vehiculos: ");
        int cantidad = entrada.nextInt();
        Vehiculo[] miVehiculo = new Vehiculo[cantidad];

        for (int i = 0; i < miVehiculo.length; i++) {
            System.out.print("Digite la marca del vehiculo: ");
            String marca = entrada.nextLine();

            System.out.print("Digite el modelo del vehiculo: ");
            int modelo = entrada.nextInt();

            System.out.print("Digite el precio del vahiculo: ");
            int precio = entrada.nextInt();
        }

        float barato = miVehiculo[0].precio;
        int indice = 0;
        for (int i = 0; i < miVehiculo.length; i++) {
            if (miVehiculo[i].precio < barato) {
                barato = miVehiculo[i].precio;
                indice = 1;
            }
        }
        System.out.println("El vehículo más barato es: " + miVehiculo[indice]);
    }
}
