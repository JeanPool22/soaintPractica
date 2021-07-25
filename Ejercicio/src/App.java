import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int numberOne, numberTwo;

        System.out.print("Digite el primer número: ");
        numberOne = entrada.nextInt();

        System.out.print("Digite el segundo número: ");
        numberTwo = entrada.nextInt();

        int suma = numberOne + numberTwo;
        int resta = numberOne - numberTwo;
        int producto = numberOne * numberTwo;
        double division = numberOne / numberTwo;
        int residuo = numberOne % numberTwo;

        System.out.println("La suma de " + numberOne + " + " + numberTwo + " es: " + suma);
        System.out.println("La resta de " + numberOne + " - " + numberTwo + " es: " + resta);
        System.out.println("El producto de " + numberOne + " * " + numberTwo + " es: " + producto);
        System.out.println("La division de " + numberOne + " / " + numberTwo + " es: " + division);
        System.out.println("El residuo de " + numberOne + " % " + numberTwo + " es: " + residuo);

    }
}
