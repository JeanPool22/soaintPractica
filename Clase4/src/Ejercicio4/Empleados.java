package Ejercicio4;

public abstract class Empleados {
    private String nombre;
    private int edad;
    private double salario;
    private static final int PLUS = 300000;
    
    public Empleados(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPLUS() {
        return PLUS;
    }

    @Override
    public String toString() {
        return "Empleados [PLUS=" + PLUS + ", edad=" + edad + ", nombre=" + nombre + ", salario=" + salario + "]";
    }

    public abstract String plusSueldo();
}
