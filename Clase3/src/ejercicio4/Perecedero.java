package ejercicio4;

public class Perecedero extends Productos {
    private int diasACaducar;

    public Perecedero(String nombre, float precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPerecedero con días a caducar: " + diasACaducar;
    }

    public void calcular(int cantidad) {
        System.out.println("Producto: " + this.toString());
        if (this.diasACaducar == 1) {
            System.out.println("El total a pagar es: " + (this.getPrecio() / 4) * cantidad + ", valor unitario: " + (this.getPrecio() / 4));
        } else if (this.diasACaducar == 2) {
            System.out.println("El total a pagar es: " + (this.getPrecio() / 3) * cantidad + ", valor unitario: " + (this.getPrecio() / 3));
        } else if (this.diasACaducar == 3){
            System.out.println("El total a pagar es: " + (this.getPrecio() / 2) * cantidad + ", valor unitario: " + (this.getPrecio() / 2));
        } else {
            System.out.println("El total a pagar es: " + this.getPrecio() * cantidad + ", valor unitario: " + this.getPrecio());
        }
    }
}
