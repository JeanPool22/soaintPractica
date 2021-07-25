package ejercicio4;

public class Productos {
    private String nombre;
    private float precio;

    public Productos(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", precio: " + precio;
    }

    public void calcular(int cantidad) {
        System.out.println("Producto: " + this.toString());
        System.out.println("El total a pagar es: " + this.precio * cantidad + ", valor unitario: " + this.precio);
    }
}
