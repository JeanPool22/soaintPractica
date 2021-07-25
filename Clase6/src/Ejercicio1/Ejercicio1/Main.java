package Ejercicio1;

public class Main {
    static int a = 0, b = 300;

    public static void main(String[] args) {
        try {
            //division();
            calculo();
        } catch (Exception e) {
            //System.out.println("Se presentó un error: " + e);
            System.out.println(e);
        } finally {
            System.out.println("Se terminó el proceso");
        }
    }

    public static int division() throws ArithmeticException {
        return a / b;
    }

    public static int calculo() throws LaExcepcion {
        if (a > 0) {
            return b / a;
        } else {
            throw new LaExcepcion("Se ha producido un error");
        }
    }
}
