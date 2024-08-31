package co.edu.uniquindio.poo;

/**
 * Tarea 1= que el metodo de nota definitiva sea personalizado tipo (la nota del def de estudiante tal es tal)}
 * 
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
        Estudiante laura= creacionEstudiante();
        Profesor esteban = creacionProfesor();
        ProgramaAcademico programa = creacionDeProgramaAcademico();
        Curso curso = creacionDeCurso(esteban);   
        curso.verificarEstudiante("10294");    
        UniversidadDelQuindio universidad = creacionUnivesidad(programa, curso);
        pepito.setNombre("Mateus");  // Método que cambia el nombre del estudiante antes de imprimirlo
        mostrarMensaje(curso);
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
        Curso curso1 = new Curso("Programacion I", esteban.getNombre());
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
        Estudiante pepito = new Estudiante("Pepito", "Lopez", "109234", "58534721", "pepito@gmail.com", (byte) 4);
        return pepito;
    }

    /**
     * Método para mostrar el mensaje final
     * @param mensaje
     */
    public  static void mostrarMensaje(Curso curso) {
        System.out.println(curso);
    }
}
