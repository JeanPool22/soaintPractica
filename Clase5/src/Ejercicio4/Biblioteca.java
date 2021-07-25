package Ejercicio4;

public class Biblioteca {
    private String codigo;
    private String titulo;
    private String fechaPublicacion;
    
    public Biblioteca(String codigo, String titulo, String fechaPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Biblioteca [codigo=" + codigo + ", fechaPublicacion=" + fechaPublicacion + ", titulo=" + titulo + "]";
    }

    public void devolerYear() {
        System.out.println(this.fechaPublicacion);
    }

    public void devolverCodigo(){
        System.out.println(this.codigo);
    }
}
