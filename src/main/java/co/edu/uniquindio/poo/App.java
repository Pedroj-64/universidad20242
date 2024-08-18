package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Estudiante pepito=creacionEstudiante();
        String mensaje = generarMensaje(pepito);
        mostrarMensaje(mensaje);

    }

    public static Estudiante creacionEstudiante() {
        Estudiante pepito = new Estudiante("Pepito", "lopez", "109234", "58534721", (byte) 4);
        return pepito;
    }

    public static String generarMensaje(Estudiante pepito) {
        String nombre = pepito.getNombre();
        String apellido = pepito.getApellido();
        String id = pepito.getId();
        String telefono = pepito.getTelefono();
        byte edad = pepito.getEdad();

        String mensaje = "Se ha creado el estudiante " + nombre + " " + apellido + " con id: " + id + " con telefono: "
                + telefono + " y edad: " + edad;
        return mensaje;
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
