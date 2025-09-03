package pe.edu.upeu.modelo;

public class Persona {
    private int idpersona;
    private String nombre;
    private String dni;

    public Persona(int idpersona, String nombre, String dni) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getIdpersona() { return idpersona; }
    public void setIdpersona(int idpersona) { this.idpersona = idpersona; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
}
