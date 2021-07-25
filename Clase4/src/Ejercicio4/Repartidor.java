package Ejercicio4;

public class Repartidor extends Empleados {
    private String zona;

    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "Repartidor [zona=" + zona + "]";
    }

    public String plusSueldo() {
        if (this.getEdad() < 25 && this.getZona().equals("zona 3")) {
            super.setSalario(this.getSalario() + this.getPLUS());
            return this.getNombre() + " recibe el PLUS";
        }
        return this.getNombre() + " No recibe el PLUS";
    }
}
