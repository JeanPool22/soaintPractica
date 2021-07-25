import java.util.Scanner;

public class Secuencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number;
        String contador = "";

        System.out.print("Digite un número: ");
        number = entrada.nextInt();

        for (int i = 0; i < number; i++) {
            contador += "*";
        }
        System.out.println(contador);
    }
}
