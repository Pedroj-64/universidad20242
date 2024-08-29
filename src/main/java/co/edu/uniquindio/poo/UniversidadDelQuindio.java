package co.edu.uniquindio.poo;

public class UniversidadDelQuindio {
    private String programa;
    private String curso;
    
    /**
     * Constructor 
     * @param programa
     * @param curso
     */
    public UniversidadDelQuindio(String programa,String curso) {
        this.programa=programa;
        this.curso=curso;
    }
    /**
     * Metodos setter y getter de aqui a abajo
     * @param curso
     */
    public void setCurso(String curso){
        this.curso=curso;
    }
    public String getCurso(){
        return curso;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getPrograma() {
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
