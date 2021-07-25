public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Persona p1 = new Persona();

        c1.numeroCaballo = 20000;
        p1.edad = 18;

        if (c1.numeroCaballo > 5000 && p1.edad > 18) {
            System.out.println("Alta cilidraje");
        }
    }
}
