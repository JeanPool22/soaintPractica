import java.util.Scanner;

public class ArregloSueldos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidad, sumaSueldos = 0;
        double promedio;

        System.out.print("Digite la cantidad de sueldos: ");
        cantidad = entrada.nextInt();

        int sueldo[] = new int[cantidad];
        
        for (int i = 0; i < sueldo.length; i++) {
            System.out.print("Digite la cantidad del sueldo " + i + ": ");
            sueldo[i] = entrada.nextInt();
            sumaSueldos += sueldo[i];
        }
        promedio = sumaSueldos / sueldo.length;
        System.out.println("La suma de los sueldos es: " + sumaSueldos);
        System.out.println("El promedio de los sueldos es: " + promedio);
    }
}
