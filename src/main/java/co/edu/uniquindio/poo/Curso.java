package co.edu.uniquindio.poo;

public class Curso {
    private String nombre;
    private int notaDef;

    public Curso(String nombre, int notaDef) {
        this.nombre = nombre;
        this.notaDef = notaDef;
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

}
