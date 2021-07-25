package ejercicio3;

public class Cuadrilatero {
    private int ladoOne;
    private int ladoTwo;

    public Cuadrilatero(int ladoOne, int ladoTwo) {
        this.ladoOne = ladoOne;
        this.ladoTwo = ladoTwo;
    }

    public Cuadrilatero(int ladoOne) {
        this.ladoOne = ladoOne;
        this.ladoTwo = ladoOne;
    }

    public int getLadoOne() {
        return ladoOne;
    }

    public void setLadoOne(int ladoOne) {
        this.ladoOne = ladoOne;
    }

    public int getLadoTwo() {
        return ladoTwo;
    }

    public void setLadoTwo(int ladoTwo) {
        this.ladoTwo = ladoTwo;
    }

    public void calcularArea() {
        System.out.println("El área es: " + ladoOne * ladoTwo);
    }

    public void calcularPerimetro() {
        System.out.println("El perimetro es: " + 2 * (ladoOne * ladoTwo));
    }
}
