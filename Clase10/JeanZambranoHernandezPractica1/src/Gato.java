public class Gato extends Animal{
    public String mauyar() {
        return super.hablar() + "Miau miau!!";
    }

    public String moverse() {
        return super.desplazarse() + "soy un gato";
    }

    public String siesta() {
        return super.dormir() + "ojala me deje dormir el humano";
    }
}
