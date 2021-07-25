package practica;

public class Factura {
    String numeroFactura;
    String fecha;
    int identificacionCliente;
    String nombreCliente;
    String nombreCajero;
    String producto;
    int cantidadProducto;
    double valorProducto;

    void calcularIva() {
        System.out.println("El IVA es 19%");
    }

    void devolverCambio() {

    }

    void obtenerCliente() {
        System.out.println("El cliente es: " + nombreCliente);
    }

    void sumarValorProductos() {

    }

    void realizarDescuento() {

    }
}
