package co.edu.uniquindio.poo;
public class Estudiante {
    
    String id,nombre,apellido,telefono;
    byte edad;

    public  Estudiante(String nombre, String apellido, String id, String telefono,byte edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.id=id;
        this.telefono=telefono;
        this.edad=edad;



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
