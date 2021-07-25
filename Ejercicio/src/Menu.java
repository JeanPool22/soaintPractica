import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numberOne, numberTwo, option = 1;

        while (option != 0) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("---------------------------Bienvenido a su calculadora--------------------------");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("¿Qué operación desea hacer?, seleccione el número correspondiente para continuar\n");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Residuo");
            System.out.println("0. Para salir\n");
            option = entrada.nextInt();

            if (option == 1) {
                System.out.print("Digite el primer número: ");
                numberOne = entrada.nextInt();
                System.out.print("Digite el segundo número: ");
                numberTwo = entrada.nextInt();
                int suma = sumar(numberOne, numberTwo);
                System.out.println("La suma de " + numberOne + " + " + numberTwo + " es: " + suma);
            }
            if (option == 2) {
                System.out.print("Digite el primer número: ");
                numberOne = entrada.nextInt();
                System.out.print("Digite el segundo número: ");
                numberTwo = entrada.nextInt();
                int resta = restar(numberOne, numberTwo);
                System.out.println("La resta de " + numberOne + " - " + numberTwo + " es: " + resta);
            }
            if (option == 3) {
                System.out.print("Digite el primer número: ");
                numberOne = entrada.nextInt();
                System.out.print("Digite el segundo número: ");
                numberTwo = entrada.nextInt();
                int producto = multiplicar(numberOne, numberTwo);
                System.out.println("El producto de " + numberOne + " * " + numberTwo + " es: " + producto);
            }
            if (option == 4) {
                System.out.print("Digite el primer número: ");
                numberOne = entrada.nextInt();
                System.out.print("Digite el segundo número: ");
                numberTwo = entrada.nextInt();
                double division = dividir(numberOne, numberTwo);
                System.out.println("La división de " + numberOne + " / " + numberTwo + " es: " + division);
            }
            if (option == 5) {
                System.out.print("Digite el primer número: ");
                numberOne = entrada.nextInt();
                System.out.print("Digite el segundo número: ");
                numberTwo = entrada.nextInt();
                int residuo = residual(numberOne, numberTwo);
                System.out.println("El residuo de " + numberOne + " % " + numberTwo + " es: " + residuo);
            }
        }
    }

    private static int sumar(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    private static int restar(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    private static int multiplicar(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    private static double dividir(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    private static int residual(int numberOne, int numberTwo) {
        return numberOne % numberTwo;
    }
}
