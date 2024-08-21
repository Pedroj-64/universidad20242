package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Estudiante pepito=creacionEstudiante();
        String mensaje = generarMensaje(pepito);
        mostrarMensaje(mensaje);

    }
    /**
     * Se crea un Objeto de tipo Estudiante con todos sus atributos
     * @return
     */
    public static Estudiante creacionEstudiante() {
        Estudiante pepito = new Estudiante("Pepito", "lopez", "109234", "58534721", "pepito@gmail.com" ,(byte) 4);
        return pepito;
    }
    /**
     * Metodo para generar un mensaje a partir de la creacion del Estudiante, utilizando getters
     * @param pepito
     * @return
     */
    public static String generarMensaje(Estudiante pepito) {
        String nombre = pepito.getNombre();
        String apellido = pepito.getApellido();
        String id = pepito.getId();
        String telefono = pepito.getTelefono();
        String correo=pepito.getCorreo();
        byte edad = pepito.getEdad();

        String mensaje = "Se ha creado el estudiante " + nombre + " " + apellido + " con id: " + id + " con telefono: "
                + telefono + " correo: "+ correo +  " y edad: " + edad;
        return mensaje;
    }
    /**
     * Metodo para mostrar el mensaje final
     * @param mensaje
     */
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
