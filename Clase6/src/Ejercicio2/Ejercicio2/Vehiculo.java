package Ejercicio2;

public class Vehiculo {
    public int precio;

    public void mostrar(){
        System.out.println("Precio: " + precio);
    }

    public Vehiculo(Marca marca){
        this.precio = marca.getPrecio();
    }
}
