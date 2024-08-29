package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class Curso {
    private String nombre;
    private String nombreProfesor;
    private int notaDef;
    private Collection<Estudiante> estudiantes;
    
    /**
     * Metodo constructor de la clase curso
     * @param nombre
     * @param notaDef
     * @param profesor
     */
    public Curso(String nombre, int notaDef, String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
        this.nombre = nombre;
        this.notaDef = notaDef;
        estudiantes = new LinkedList<>();
    }
    
    /**
     * Metodos setter && getter del codigo
     * @return
     */
    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotaDef(int notaDef) {
        this.notaDef = notaDef;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNotaDef() {
        return notaDef;
    }
    /**
     * Este metodo lo que hace es verificar a base de una cedula de un estudiante listado si el mismo se encuentra o no en la lista
     * @param estudiantes
     * @return
     */
    public static boolean verificarEstudiante(Collection<Estudiante> estudiantes) {
        Scanner entrada = new Scanner(System.in);
        boolean banderilla = false;
        System.out.println("Por favor ingrese la cedula del estudiante al que quiere verificar");
        String verificar = entrada.nextLine();
        for (Estudiante estudiante : estudiantes) {
            if (verificar == estudiante.getCedula()) {
                banderilla = true;
            } else {
                banderilla = false;
            }

        }
        entrada.close();
        return banderilla;
    }
    /**
     * Metodo toString para mejor presentacion
     */
    @Override
    public String toString() {
        return "Curso [nombre=" + nombre + ", profesor=" + nombreProfesor + ", notaDef=" + notaDef + ", estudiantes="
                + estudiantes + "]";
    }
    /**
     * Metodo para agregar estudiantes a la coleccion 
     * @param estudiante
     * @param estudiantes
     */
    public static void agregarEstudiante(Estudiante estudiante, Collection<Estudiante> estudiantes) {
        estudiantes.add(estudiante);
    }
    /**
     * Metodo para a base de la cedula eliminar al estudiante encontrado en la lista
     * @param estudiantes
     */
    public static void eliminarEstudiante(Collection<Estudiante> estudiantes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca la cedula del estudiante que quiere elimina ");
        String cedula = entrada.nextLine();
        for (Estudiante estudiante : estudiantes) {
            if (cedula == estudiante.getCedula()) {
                estudiantes.remove(estudiante);
                System.out.println("Estudiante eliminado");
            } else {
                System.out.println("Se dio un error, el estudiante no existe");
            }

        }
        entrada.close();
    }
}
