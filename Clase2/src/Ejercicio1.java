import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase;
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
        String asA = "", asE = "", asI = "", asO = "", asU = "";
        char caracter;

        System.out.print("Ingrese la frase: ");
        frase = entrada.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            switch (caracter) {
            case 'a':
                contadorA++;
                asA += "*";
                break;
            case 'e':
                contadorE++;
                asE += "*";
                break;
            case 'i':
                contadorI++;
                asI += "*";
                break;
            case 'o':
                contadorO++;
                asO += "*";
                break;
            case 'u':
                contadorU++;
                asU += "*";
                break;
            default:
                break;
            }
        }
        System.out.println("A " + contadorA + " " + asA);
        System.out.println("E " + contadorE + " " + asE);
        System.out.println("I " + contadorI + " " + asI);
        System.out.println("O " + contadorO + " " + asO);
        System.out.println("U " + contadorU + " " + asU);
    }
}
