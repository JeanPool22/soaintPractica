package Ejercicio2;

public class Factura {
    public static int contadorDeObjetos;

    static {
        contadorDeObjetos = 0;
    }

    public Factura() {
        contadorDeObjetos++;

        System.out.println("Factura " + contadorDeObjetos + " creada");
        if (contadorDeObjetos >= 5) {
            System.out.println("Limite de objetos generados");
        }
    }
}
