package Ejercicio4;

public class Libro extends Biblioteca implements Prestable {
    private boolean prestado;

    public Libro(String codigo, String titulo, String fechaPublicacion) {
        super(codigo, titulo, fechaPublicacion);
        this.prestado = false;
    }

    @Override
    public String toString() {
        return super.toString() + "Libro [prestado=" + prestado + "]";
    }

    public boolean prestar() {
        return this.prestado;
    }

    public boolean devolver() {
        return true;
    }

    public boolean prestado() {
        return this.prestado;
    }
}
