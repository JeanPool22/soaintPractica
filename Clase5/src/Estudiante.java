public class Estudiante extends Persona{
    private String codigoEstudiante;

    public Estudiante(String nombre, String apellido, String codigoEstudiante) {
        super(nombre, apellido);
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public void mostrarDatos() {
        System.out.println("Los datos de la persona son: codigo estudiante: " + codigoEstudiante);
    }
}
