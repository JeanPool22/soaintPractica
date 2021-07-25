package Ejercicio4;

public class Revista extends Biblioteca{
    private int numero;

    public Revista(String codigo, String titulo, String fechaPublicacion, int numero) {
        super(codigo, titulo, fechaPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + "Revista [numero=" + numero + "]";
    }

    
}
