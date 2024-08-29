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
        Profesor esteban=creacionProfesor();
        UniversidadDelQuindio universidad=creacionUnivesidad();
        ProgramaAcademico programa=creacionDeProgramaAcademico();
        Curso curso=creacionDeCurso(esteban);
        pepito.setNombre("Mateus");  //Metodo que cambia el nombre del estudiante antes de printearlo
        String mensaje=generarMensaje(universidad, esteban, programa, curso, pepito);
        mostrarMensaje(mensaje);

    }


    /**
     * Metodo para la creacion del profesor a partir del constructor del mismo
     * @return
     */
    public static Profesor creacionProfesor(){
        Profesor esteban=new Profesor("Esteban", "405689203", Categoria.AUXILIAR);
        return esteban;
    }
    /**
     * Metodo para la creacion del curso a partir del constructor del mismo, utilizando el nombre del profesor asignado en este caso esteban ( por ello se getea al final)
     * @param esteban
     * @return
     */
    public static Curso creacionDeCurso(Profesor esteban){
        Curso curso1=new Curso("Programacion I", 5, esteban.getNombre());
        return curso1;
    }
    /**
     * Metodo para la creacion del Programa academico a partir del constructor del mismo
     * @return
     */
    public static ProgramaAcademico creacionDeProgramaAcademico(){
        ProgramaAcademico programa=new ProgramaAcademico("ing de sistemas y computacion");
        return programa;
    }
    /**
     * Metodo para la creacion de la universidad  a partir del constructor del mismo
     * @return
     */
    public static UniversidadDelQuindio creacionUnivesidad(){
        UniversidadDelQuindio universidad=new UniversidadDelQuindio(null, null);
        return universidad;
    }
    /**
     * Se crea un Objeto de tipo Estudiante con todos sus atributos
     * @return
     */
    public static Estudiante creacionEstudiante() {
        Estudiante pepito = new Estudiante("Pepito", "lopez", "109234", "58534721", "pepito@gmail.com" ,(byte) 4,7,8,5);
        return pepito;
    }
    public static String generarMensaje(UniversidadDelQuindio uni,Profesor profesor,ProgramaAcademico pAcademico, Curso curso, Estudiante estudiante){
        String mensaje=(uni.toString()+profesor.toString()+pAcademico.toString()+curso.toString()+estudiante.toString());
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
