package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Productos[] misProductos = new Productos[5];

        misProductos[0] = new Perecedero("yogurt", 5000F, 1);
        misProductos[1] = new Perecedero("manzana", 500F, 2);
        misProductos[2] = new Perecedero("aguacate", 8000F, 3);
        misProductos[3] = new NoPerecederos("arroz", 2600F, "grano");
        misProductos[4] = new Productos("cereal", 5500F);

        for (int i = 0; i < misProductos.length; i++) {
            System.out.println("\nVenta del producto número " + (i + 1) + ":");
            misProductos[i].calcular(5);
        }
    }
}
