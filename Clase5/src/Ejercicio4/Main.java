package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Biblioteca libro = new Libro("ad789", "Caperusa", "15/01/2020"); 
        Biblioteca revista = new Revista("ju612", "Motor", "23/12/1998", 49876);
        Libro miLibro = new Libro("ad789", "Caperusa", "15/01/2020");

        miLibro.devolver();
        miLibro.prestado();

        for (Biblioteca i : libro) {
            
            if (i instanceof Libro) {
                ((Libro) i).prestado();
            }
        }
        
        System.out.println(libro);
        System.out.println(revista);
    }
}
