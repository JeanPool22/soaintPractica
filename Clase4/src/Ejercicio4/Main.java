package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Comercial miComercial = new Comercial("Juan", 63, 800000, 250000);
        Comercial miComercial2 = new Comercial("Natalia", 25, 800000, 50000);
        Repartidor miRepartidor = new Repartidor("Oscar", 21, 900000, "zona 3");
        Repartidor miRepartidor2 = new Repartidor("Fernando", 36, 900000, "zona 2");

        System.out.println(miComercial.plusSueldo());
        System.out.println(miComercial2.plusSueldo());
        System.out.println(miRepartidor.plusSueldo());
        System.out.println(miRepartidor2.plusSueldo());
    }
}
