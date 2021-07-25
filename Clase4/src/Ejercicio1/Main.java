package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Perez", 60);
        Persona p2 = new Persona("Oscar", 60);

        if (p1.getEdad() == p2.getEdad()) {
            System.out.println(p1.getNombre() + " tiene " + p1.getEdad());
        } else {
            System.out.println(Persona.mayor(p1, p2).getNombre() + " es mayor");
        }
    }
}
