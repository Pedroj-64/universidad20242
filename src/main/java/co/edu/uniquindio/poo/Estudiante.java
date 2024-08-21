package co.edu.uniquindio.poo;

public class Estudiante {

    String id, nombre, apellido, telefono, correo;
    byte edad;
    /**
     * Metodo constructor de la clase estudiante
     * @param nombre
     * @param apellido
     * @param id
     * @param telefono
     * @param correo
     * @param edad
     */
    public Estudiante(String nombre, String apellido, String id, String telefono, String correo, byte edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;

    }
    /**
     * De aqui a abajo hay metodod getters y setters para recuperar info de Estudiante
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

}
