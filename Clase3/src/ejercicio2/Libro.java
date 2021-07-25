package ejercicio2;

public class Libro {
    private long isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void imprimirLibro () {
        System.out.println("El libro " + titulo + " con " + isbn + " creado por el autor " + autor + " tiene " + paginas + " páginas");
    }
}
