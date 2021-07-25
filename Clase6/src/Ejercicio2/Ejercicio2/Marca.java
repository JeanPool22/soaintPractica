package Ejercicio2;

public enum Marca {
    MAZDA(200), TOYOTA(100), FORD(150), KIA(200);

    private final int precio;

    private Marca(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
