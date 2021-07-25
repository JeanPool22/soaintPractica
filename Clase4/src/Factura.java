public class Factura {
    public static int cantidadFacturas = 3;

    public Factura() {
        cantidadFacturas++;
    }

    public static int getCantidadFacturas() {
        return cantidadFacturas;
    }

    public static void setCantidadFacturas(int cantidadFacturas) {
        Factura.cantidadFacturas = cantidadFacturas;
    }
    
    
}
