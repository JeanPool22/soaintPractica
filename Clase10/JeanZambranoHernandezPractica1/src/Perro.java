public class Perro extends Animal{
    public String ladrar(){
        return super.hablar() + "Gua gua!!";
    }

    public String moverse() {
        return super.desplazarse() + "soy un perro";
    }

    public String siesta() {
        return super.dormir() + "espero a mi amo para dormir";
    }
}
