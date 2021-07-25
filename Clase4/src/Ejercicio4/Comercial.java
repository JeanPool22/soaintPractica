package Ejercicio4;

public class Comercial extends Empleados {
    private double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() + " Comercial [comision=" + comision + "]";
    }

    public String plusSueldo() {
        if (this.getEdad() > 30 && this.getComision() > 200000) {
            super.setSalario(super.getSalario() + super.getPLUS());
            return this.getNombre() + " recibe el PLUS";
        }
        return this.getNombre() + " No recibe el PLUS";
    }
}
