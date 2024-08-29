package co.edu.uniquindio.poo;

public class UniversidadDelQuindio {
    private ProgramaAcademico programa;
    private Curso curso;
    
    /**
     * Constructor 
     * @param programa
     * @param curso
     */
    public UniversidadDelQuindio(ProgramaAcademico programa,Curso curso) {
        this.programa=programa;
        this.curso=curso;
    }
    /**
     * Metodos setter y getter de aqui a abajo
     * @param curso
     */
    public void setCurso(Curso curso){
        this.curso=curso;
    }
    public Curso getCurso(){
        return curso;
    }
    public void setPrograma(ProgramaAcademico programa) {
        this.programa = programa;
    }

    public ProgramaAcademico getPrograma() {
        return programa;
    }
    /**
     * Metodo toString para mejor presentacion
     */
    @Override
    public String toString() {
        return " Se ha creaado a la Universidad Del Quindio [programa=" + programa + "]";
    }

}
