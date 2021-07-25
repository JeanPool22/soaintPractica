public class Administrativo extends Persona {
    private String cargo;

    public Administrativo(String nombre, String apellido, String cargo) {
        super(nombre, apellido);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void mostrarDatos() {
        System.out.println("Los datos de la persona son: codigo estudiante: " + cargo);
    }
}
