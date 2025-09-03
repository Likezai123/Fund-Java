package pe.edu.upeu.enums;

enum GENERO{FEMENINO, MASCULINO}
public class Estudiante {
    String codigo;
    String nombre;
    String apellido;
    GENERO genero;
    Carrera carrera;

    public Estudiante(String codigo, String nombre,
                      String apellido, GENERO genero,
                      Carrera carrera
                      ) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.carrera = carrera;
    }

    public static void main(String[] args) {
        Estudiante juan = new Estudiante("202512345", "Juan", "Quispe", GENERO.MASCULINO, Carrera.Sistemas
        );

        System.out.println(juan.codigo +" "+juan.genero+" "+juan.carrera);

        for (Carrera carreras: Carrera.values()) {

            System.out.println(carreras);

        }
    }

}
