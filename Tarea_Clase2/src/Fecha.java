import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String fecha;

        System.out.print("Digite una fecha: ");
        fecha = entrada.nextLine();
        boolean respuesta = validar(fecha);

        if (respuesta == true) {
            System.out.println("La fecha tiene un formato valido");
        } else {
            System.out.println("La fecha no tiene un formato valido");
        }
    }

    public static boolean validar(String fecha) {
        try {
            // Se crea una instancia de la clase SimpleDateFormat
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            // setLenient hace que la entrada coincida con el formato del objeto
            formato.setLenient(false);
            formato.parse(fecha);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
