package co.edu.uniquindio.poo;

public class ProgramaAcademico {
    private String nombre;
    /**
     * 
     * @param nombre
     */
    public ProgramaAcademico(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodos Getter y Setter de la clase
     * 
     * @param nombre
     */
    public void setProgramaAcademico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    
    @Override
    public String toString() {
        return "Programa Academico [nombre=" + nombre + "]";
    }

}
