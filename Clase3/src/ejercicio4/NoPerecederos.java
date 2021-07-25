package ejercicio4;

public class NoPerecederos extends Productos {
    private String tipo;

    public NoPerecederos(String nombre, float precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNo Perecedero tipo: " + tipo;
    }
}
