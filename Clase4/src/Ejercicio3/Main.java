package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Moto> miMoto = new ArrayList<Moto>();
        ArrayList<String> marcas = new ArrayList<>();
        ArrayList<Integer> modelos = new ArrayList<>();

        miMoto.add(new Moto("bmw", "black", 2020, 489745));
        miMoto.add(new Moto("yamaha", "red", 2015, 9745));
        miMoto.add(new Moto("yamaha", "red", 2015, 9745));
        miMoto.add(new Moto("dugatti", "blue", 2002, 4845));
        miMoto.add(new Moto("dugatti", "yellow", 2003, 484795));

        System.out.println("\nMarcas");
        for (Moto moto : miMoto) {
            String marca = moto.getMarca();
            int cantMarca = 0;
            for (Moto motoAux : miMoto) {
                if (motoAux.getMarca().equals(marca)) {
                    cantMarca++;
                }
            }
            if (!marcas.contains(marca)) {
                System.out.println("Marca: " + marca + ", Cantidad: " + cantMarca);
            }
            marcas.add(marca);
        }

        System.out.println("\nModelos");
        for (Moto moto : miMoto) {
            int modelo = moto.getModelo();
            String marca = moto.getMarca();
            int cantModelos = 0;
            for (Moto motoAux : miMoto) {
                if (motoAux.getModelo() == (modelo)) {
                    cantModelos++;
                }
            }
            if (!modelos.contains(modelo)) {
                System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Cantidad: " + cantModelos);
            }
            modelos.add(modelo);
        }

        System.out.println("\nOrden de marcas");
        Collections.sort(miMoto, new Comparator<Moto>() {
            public int compare(Moto o1, Moto o2) {
                return new String(o1.getMarca()).compareTo(new String(o2.getMarca()));
            }
        });
        for (int i = 0; i < miMoto.size(); i++) {
            System.out.println("Moto [" + (i + 1) + "]: " + miMoto.get(i).getMarca());
        }
    }
}
