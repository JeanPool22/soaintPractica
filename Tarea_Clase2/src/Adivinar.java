import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number = 0;
        int aleatorio = (int) (Math.random() * 100 + 1);

        while (number != aleatorio) {
            System.out.print("Digite el número para ser evaluado: ");
            number = entrada.nextInt();

            if (number > aleatorio) {
                System.out.println("El número es menor");
            } else if (number < aleatorio) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("Es el mismo número, Ganaste!!");
            }
        }
    }
}