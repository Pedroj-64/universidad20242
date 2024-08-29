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
        Estudiante pepito = creacionEstudiante();
        Profesor esteban = creacionProfesor();
        ProgramaAcademico programa = creacionDeProgramaAcademico();
        Curso curso = creacionDeCurso(esteban);       
        UniversidadDelQuindio universidad = creacionUnivesidad(programa, curso);
        pepito.setNombre("Mateus");  // Método que cambia el nombre del estudiante antes de imprimirlo
        String mensaje = generarMensaje(universidad, esteban, programa, curso, pepito);
        mostrarMensaje(mensaje);
    }


    /**
     * Método para la creación del profesor a partir del constructor del mismo
     * @return
     */
    public static Profesor creacionProfesor() {
        Profesor esteban = new Profesor("Esteban", "405689203", Categoria.AUXILIAR);
        return esteban;
    }

    /**
     * Método para la creación del curso a partir del constructor del mismo, utilizando el nombre del profesor asignado en este caso Esteban (por ello se obtiene al final)
     * @param esteban
     * @return
     */
    public static Curso creacionDeCurso(Profesor esteban) {
        Curso curso1 = new Curso("Programación I", 5, esteban.getNombre());
        return curso1;
    }

    /**
     * Método para la creación del Programa académico a partir del constructor del mismo
     * @return
     */
    public static ProgramaAcademico creacionDeProgramaAcademico() {
        ProgramaAcademico programa = new ProgramaAcademico("Ingeniería de Sistemas y Computación");
        return programa;
    }

    /**
     * Método para la creación de la universidad a partir del constructor del mismo
     * @return
     */
    public static UniversidadDelQuindio creacionUnivesidad(ProgramaAcademico programa, Curso curso) {
        UniversidadDelQuindio universidad = new UniversidadDelQuindio(programa.getNombre(), curso.getNombre());
        return universidad;
    }

    /**
     * Se crea un objeto de tipo Estudiante con todos sus atributos
     * @return
     */
    public static Estudiante creacionEstudiante() {
        Estudiante pepito = new Estudiante("Pepito", "Lopez", "109234", "58534721", "pepito@gmail.com", (byte) 4, 7, 8, 5);
        return pepito;
    }

    public static String generarMensaje(UniversidadDelQuindio uni, Profesor profesor, ProgramaAcademico pAcademico, Curso curso, Estudiante estudiante) {
        String mensaje = uni.toString() + profesor.toString() + pAcademico.toString() + curso.toString() + estudiante.toString();
        return mensaje;
    }

    /**
     * Método para mostrar el mensaje final
     * @param mensaje
     */
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
