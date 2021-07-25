public class Main {
    public static void main(String[] args) {
        // Hombre
        Hombre hombre = new Hombre();
        System.out.println(hombre.hablar() + " " + hombre.desplazarse() + " " + hombre.dormir() + " " + hombre.bailar()
                + " " + hombre.estudiar() + " " + hombre.trabajar());

        // Mujer
        Mujer mujer = new Mujer();
        System.out.println(mujer.hablar() + " " + mujer.desplazarse() + " " + mujer.dormir() + " " + mujer.bailar()
                + " " + mujer.estudiar() + " " + mujer.trabajar());

        // Perro
        Perro perro = new Perro();
        System.out.println(perro.ladrar() + " " + perro.moverse() + " " + perro.siesta());

        // Gato
        Gato gato = new Gato();
        System.out.println(gato.mauyar() + " " + gato.moverse() + " " + gato.siesta());
    }
}
