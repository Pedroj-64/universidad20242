package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        Estudiante pepito=creacionEstudiante();
        pepito.setNombre("Mateus");  //Metodo que cambia el nombre del estudiante antes de printearlo
        String mensaje=comprobarNotas(pepito);
        mostrarMensaje(mensaje);

    }
    /**
     * Se crea un Objeto de tipo Estudiante con todos sus atributos
     * @return
     */
    public static Estudiante creacionEstudiante() {
        Estudiante pepito = new Estudiante("Pepito", "lopez", "109234", "58534721", "pepito@gmail.com" ,(byte) 4,7,8,5);
        return pepito;
    }
    
    /**
     * Metodo para comprobar notas en el mismo se genera el mensaje para poderlo imprimir en el proximo metodo
     * @param pepito
     * @return
     */
    public static String comprobarNotas(Estudiante pepito) {
        double nota1=pepito.getNota1();
        double nota2=pepito.getNota2();
        double nota3=pepito.getNota3();
        String mensaje;
        if (nota1 < 5 && nota2 < 5 && nota3 < 5) {
            mensaje=("Las notas tienen que estar en el rango de 0.0 a 5.0");
        } else if (nota1 > 0 && nota2 > 0 && nota3 > 0) {
            mensaje=("Las notas tienen que estar en el rango de 0.0 a 5.0");
        }else{
            mensaje=pepito.toString();
        }  
        return mensaje;
        
    }
    /**
     * Metodo para mostrar el mensaje final
     * @param mensaje
     */

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
