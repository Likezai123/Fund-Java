package pe.edu.upeu.enums;

enum GENERO{Femenino,Masculino}

public class Estudiante {
    private String codigo;
    private String nombre;
    private String apellido;
    private GENERO genero;
    private Carrera carrera;


    public Estudiante(String codigo, String nombre,
                      String apellido, GENERO genero,
                      Carrera carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.carrera = carrera;
    }

    public static void main(String[] args) {
        Estudiante e = new Estudiante(
                "202510876", "Piero", "Ccari",
                GENERO.Masculino, Carrera.Sistemas
        );

        System.out.println(e.codigo + " " + e.genero + " " + e.carrera);

        for (Carrera c : e.carrera.values()) {
            System.out.println(c);
        }
    }
}
