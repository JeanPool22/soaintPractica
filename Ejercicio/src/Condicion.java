import java.util.Scanner;

public class Condicion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numberOne, numberTwo;

        System.out.print("Digite el primer número: ");
        numberOne = entrada.nextInt();

        System.out.print("Digite el segundo número: ");
        numberTwo = entrada.nextInt();

        boolean one = numberOne > numberTwo;
        boolean two = numberOne < numberTwo;
        boolean three = numberOne == numberTwo;

        System.out.println(one + "\n" + two + "\n" + three);
    }
}
