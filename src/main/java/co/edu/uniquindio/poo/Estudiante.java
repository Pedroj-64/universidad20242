package co.edu.uniquindio.poo;

public class Estudiante {

    String id, nombre, apellido, telefono, correo,cedula;
    double nota1, nota2, nota3;
    byte edad;

    /**
     * Metodo constructor de la clase estudiante
     * Importante info para aprender=los "this.nombreDeVariable=NombreDeVariable es
     * una representacion de que se va utilizar las variables creadas con el
     * constructor en algun lado y no los valores inicilizados (si los hay)"
     * 
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
        validarNota(nota1);
        validarNota(nota2);
        validarNota(nota3);
    }

    /**
     * De aqui a abajo hay metodod getters y setters para recuperar info de
     * Estudiante
     * 
     * @return
     */
    public String getCedula(){
        return cedula;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

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

    /**
     * Metodo para calcular el promedio de las notas del estudiante introducidas en el contructor
     * @param nota1
     * @param nota2
     * @param nota3
     * @return
     */
    public static double promedioNotas(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    private static void validarNota(double nota){
        if(nota<0.0 || nota>5.0){
            System.out.println("Las notas tienen que estar en un rango de 0.0 a 5.0");
        }
    }

    /**
     * Metodo toString el cual sirve para dale formato de salida a alguna clase
     */
    public String toString() {
        return "Se ha creado el estudiante " + nombre + " " + apellido + " con id: " + id + " con telefono: "
                + telefono + " correo: " + correo + " y edad: " + edad + " sus notas son:" + nota1 + ", " + nota2 + ", "
                + nota3 + ", " + " y su promedio academico es: " + promedioNotas(nota1, nota2, nota3);
    }
}
