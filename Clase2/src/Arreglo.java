public class Arreglo {
    public static void main(String[] args) {
        int enteros[] = { 5, 7, 6, 7, 24, 49, 3, 14, 6, 2 };
        int suma = 0;

        // for (int i = 0; i < enteros.length; i++) {
        //     suma += enteros[i];
        // }
        for (int i : enteros) {
            suma += i;
        }
        System.out.println("la suma de los enteros es: " + suma);
    }
}
