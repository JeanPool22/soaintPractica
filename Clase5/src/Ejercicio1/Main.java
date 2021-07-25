package Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();

        animal.add(new Gato());
        animal.add(new Perro());
        animal.add(new Perro());
        animal.add(new Gato());
        animal.add(new Perro());

        for (int i = 0; i < animal.size(); i++) {
            animal.get(i).emitirSonido();
        }

        for (Animal animal2 : animal) {
            animal2.emitirSonido();
        }
    }
}
