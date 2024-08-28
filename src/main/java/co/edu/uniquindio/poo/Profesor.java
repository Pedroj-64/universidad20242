package co.edu.uniquindio.poo;

public class Profesor {
    private String nombre;
    private String cedula;
    private Categoria puesto;

    public Profesor(String nombre, String cedula, Categoria puesto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.puesto = puesto;
    }

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

    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + ", cedula=" + cedula + ", puesto=" + puesto + "]";
    }



}
