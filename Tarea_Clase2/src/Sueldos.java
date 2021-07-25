import java.util.Scanner;

public class Sueldos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int sueldo[] = new int[4];
        int sumaSueldos = 0, mayores = 0;
        double promedioSueldos;

        for (int i = 0; i < sueldo.length; i++) {
            System.out.print("Digite el sueldo: ");
            sueldo[i] = entrada.nextInt();
            sumaSueldos += sueldo[i];
            if (sueldo[i] > 750000) {
                mayores++;
            }
        }
        promedioSueldos = sumaSueldos / sueldo.length;
        System.out.println("La suma de los sueldos es: " + sumaSueldos);
        System.out.println("El promedio de los sueldos es: " + promedioSueldos);
        System.out.println("Existen " + mayores + " sueldos mayores a $750.000");
    }
}
