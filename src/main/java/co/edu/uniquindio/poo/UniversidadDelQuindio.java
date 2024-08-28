package co.edu.uniquindio.poo;

public class UniversidadDelQuindio {
    private ProgramaAcademico programa;

    public UniversidadDelQuindio() {
    }

    public void setPrograma(ProgramaAcademico programa) {
        this.programa = programa;
    }

    public ProgramaAcademico getPrograma() {
        return programa;
    }

    @Override
    public String toString() {
        return "Universidad Del Quindio [programa=" + programa + "]";
    }

}
