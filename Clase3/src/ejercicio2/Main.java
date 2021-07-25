package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Libro libroOne = new Libro();
        Libro libroTwo = new Libro();

        libroOne.setTitulo("Caperucita Roja");
        libroOne.setIsbn(48974562);
        libroOne.setAutor("JuanMa");
        libroOne.setPaginas(98);

        libroTwo.setTitulo("Blanca Nieves");
        libroTwo.setIsbn(7894561);
        libroTwo.setAutor("JuanPa");
        libroTwo.setPaginas(734);

        libroOne.imprimirLibro();
        libroTwo.imprimirLibro();

        if (libroOne.getPaginas() > libroTwo.getPaginas()) {
            System.out.println("El libro " + libroOne.getTitulo() + " tiene más páginas");
        } else {
            System.out.println("El libro " + libroTwo.getTitulo() + " tiene más páginas");
        }
    }
}
