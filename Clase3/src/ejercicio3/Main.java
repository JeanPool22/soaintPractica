package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cuadrilatero miCuadrilatero;

        System.out.print("Digite el primer lado: ");
        int ladoUno = entrada.nextInt();
        System.out.print("Digite el segundo lado: ");
        int ladoDos = entrada.nextInt();

        if (ladoUno == ladoDos) {
            miCuadrilatero = new Cuadrilatero(ladoUno);
            System.out.println("Es un cuadrado");
            miCuadrilatero.calcularArea();
            miCuadrilatero.calcularPerimetro();
        } else {
            miCuadrilatero = new Cuadrilatero(ladoUno, ladoDos);
            miCuadrilatero.calcularArea();
            miCuadrilatero.calcularPerimetro();
        }
    }
}
