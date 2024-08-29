package co.edu.uniquindio.poo;

public class Profesor {
    private String nombre;
    private String cedula;
    private Categoria puesto;
    /**
     * Metodo constructor del profesor
     * @param nombre
     * @param cedula
     * @param puesto
     */
    public Profesor(String nombre, String cedula, Categoria puesto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.puesto = puesto;
    }
    /**
     * Getter && Setters del programa
     * @return
     */
    public Categoria getPuesto() {
        return puesto;
    }

    public void setPuesto(Categoria puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    /**
     * Metodo toString para mejorar presentacion
     */
    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + ", cedula=" + cedula + ", puesto=" + puesto + "]";
    }



}
