public class Hombre extends Humano{
    public String hablar() {
        return super.hablar() + "soy hombre";
    }

    public String desplazarse() {
        return super.desplazarse() + "uso zapatillas";
    }

    public String dormir() {
        return  super.dormir() + "solo debo acostarme";
    }

    public String bailar() {
        return super.bailar() + "soy un completo tronco";
    }

    public String estudiar() {
        return super.estudiar() + "para pasar el examen";
    }

    public String trabajar() {
        return super.trabajar() + "para invitar a la familia";
    }
}
