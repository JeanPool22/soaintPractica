public class App {
    public static void main(String[] args) throws Exception {
        double nota = 1.5;

        if (nota >= 3) {
            System.out.println("Aprobado");
        } else if (nota >= 2.5) {
            System.out.println("Entra a supervisión");
        } else {
            System.out.println("Reprobado");
        }
    }
}
