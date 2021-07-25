package practica;

public class Principal {
    public static void main(String[] args) {
        Factura miFactura = new Factura();

        miFactura.nombreCliente = "Juan Perez";
        miFactura.numeroFactura = "hu4589";

        miFactura.calcularIva();
        miFactura.obtenerCliente();
    }
}
