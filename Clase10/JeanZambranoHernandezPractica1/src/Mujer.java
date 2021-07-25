public class Mujer extends Humano{
    public String hablar() {
        return super.hablar() + "soy mujer";
    }

    public String desplazarse() {
        return super.desplazarse() + "uso tacones";
    }

    public String dormir() {
        return  super.dormir() + "debo desmaquillarme";
    }

    public String bailar() {
        return super.bailar() + "me encanta bailar";
    }

    public String estudiar() {
        return super.estudiar() + "para pasar el examen";
    }

    public String trabajar() {
        return super.trabajar() + "para comprarme ropa";
    }
}
