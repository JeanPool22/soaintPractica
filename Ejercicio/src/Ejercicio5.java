import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double guillermo;

        System.out.print("Digite el número de dolares que tiene Guillermo: ");
        guillermo = entrada.nextDouble();

        double luis = guillermo / 2;
        double juan = (guillermo + luis) / 2;

        System.out.println("Gullermo tiene: " + guillermo);
        System.out.println("Luis tiene: " + luis);
        System.out.println("Juan tiene: " + juan);

        
    }
}