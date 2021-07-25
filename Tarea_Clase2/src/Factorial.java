import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number;

        System.out.print("Digite un número: ");
        number = entrada.nextInt();

        System.out.println(calcular(number));
    }

    public static int calcular(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calcular(n - 1);
    }
}
