import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number, numberOne = 1, numberTwo = 1;

        System.out.print("Digite el número: ");
        number = entrada.nextInt();

        if (number % 2 == 0) {
            System.out.println("El número es par");
        }
        else {
            System.out.println("El número es impar");
        }

        System.out.print("Su serie Fibonacci es: " + numberOne + " ");
        for (int i = 2; i <= number; i++){
            System.out.print(numberTwo + " ");
            numberTwo = numberOne + numberTwo;
            numberOne = numberTwo - numberOne;
        }
    }
}
