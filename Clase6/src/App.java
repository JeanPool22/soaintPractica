public class App {
    public static void main(String[] args) throws Exception {
        int[] arreglo = { 5, 4, 89, 14, 32 };
        int a = 35, b = 0, division = 0;

        try {
            for (int i = 0; i <= arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }
            division = a / b;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se presentó un error: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Se presentó un error: " + e);
        } finally {
            System.out.println("Se terminó la ejecución");
        }
    }
}
