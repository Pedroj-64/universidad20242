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
        Estudiante pepito=creacionEstudiante();
        double promedio=calcPromedio(pepito);
        String mensaje = generarMensaje(pepito,promedio);
        mostrarMensaje(mensaje);

    }
    /**
     * Se crea un Objeto de tipo Estudiante con todos sus atributos
     * @return
     */
    public static Estudiante creacionEstudiante() {
        Estudiante pepito = new Estudiante("Pepito", "lopez", "109234", "58534721", "pepito@gmail.com" ,(byte) 4,3,2,5);
        return pepito;
    }
    /**
     * Metodo para generar un mensaje a partir de la creacion del Estudiante, utilizando getters
     * @param pepito
     * @return
     */
    public static String generarMensaje(Estudiante pepito, double promedio) {

        String mensaje = pepito.toString() + promedio;
        return mensaje;
    }

    public static double calcPromedio(Estudiante pepito){
        double nota1=pepito.getNota1();
        double nota2=pepito.getNota2();
        double nota3=pepito.getNota3();
        double promedio=(nota1+nota2+nota3)/3.0;
        return promedio;
    }
    /**
     * Metodo para mostrar el mensaje final
     * @param mensaje
     */

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
