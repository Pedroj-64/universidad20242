package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Curso {
    private String nombre;
    private String nombreProfesor;
    private int notaDef;
    private Collection<Estudiante> estudiantes;
    
    /**
     * Método constructor de la clase Curso
     * @param nombre
     * @param notaDef
     * @param nombreProfesor
     */
    public Curso(String nombre, String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
        this.nombre = nombre;
        estudiantes = new LinkedList<>();
    }
    
    /**
     * Métodos setter y getter
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
     * Este método verifica si un estudiante con la cédula dada está en la lista
     * @param id
     * @return
     */
    public boolean verificarEstudiante(String id) {
        boolean banderilla = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(id)) {
                banderilla = true;
            }
        }
        return banderilla;
    }
    /**
     * Método para agregar estudiantes a la colección
     * @param estudiante
     */
    public void agregarEstudiante(boolean banderilla,Estudiante estudiante) {
        if(banderilla==true){
            estudiantes.add(estudiante);
        }
    }
    
    /**
     * Método para eliminar al estudiante con la cédula dada de la lista
     */
    public  void eliminarEstudiante(String id) {
        for (Estudiante estudiante: estudiantes) {
            if(estudiante.getCedula().equals(id)){
                estudiantes.remove(estudiante);
                break;
            }
            
        }
    }
    public double asignarNotas(String id,double nota1,double nota2,double nota3){
        String resultadoNull="No existen estudiante para asignar notas";
        double resultado=0;
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getCedula().equals(id)){
                estudiante.setNota1(nota1);
                estudiante.setNota2(nota2);
                estudiante.setNota3(nota3);
                

            }else{
                System.out.println(resultadoNull);
            }
        }
        return resultado;
    }
    /**
     * Método toString para mejor presentación
     */
    @Override
    public String toString() {
        return "Curso [nombre=" + nombre + ", profesor=" + nombreProfesor + ", notaDef=" + notaDef + ", estudiantes="
                + estudiantes + "]";
    }
}
