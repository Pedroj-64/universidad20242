package co.edu.uniquindio.poo;

public class ProgramaAcademico {
    private String nombre;
    /**
     * Metodo constructor para el programa academico solo pidiendo el nombre de el mismo
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
    /**
     * Metodos setter y getter para aqui abajo
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    /**
     * Metodo toString para presentar la creacion del programa de forma mas linda
     */
    @Override
    public String toString() {
        return "Programa Academico [nombre=" + nombre + "]";
    }

}
