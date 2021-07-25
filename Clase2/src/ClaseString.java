import java.util.Scanner;

public class ClaseString {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido;

        System.out.print("Digite el nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Digite el apelido: ");
        apellido = entrada.nextLine();

        String fullName = nombre.concat(" " + apellido);
        int caractes = fullName.length();
        System.out.println("El nombre completo tiene " + caractes + " caracteres y es " + fullName);
    }
}
