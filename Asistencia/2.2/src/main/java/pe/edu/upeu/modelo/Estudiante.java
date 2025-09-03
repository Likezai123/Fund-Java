package pe.edu.upeu.modelo;

public class Estudiante extends Persona {
    private String codigo;
    private String carrera;

    public Estudiante(String codigo, String carrera, int id, String nombre, String dni) {
        super(id, nombre, dni);
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
}
