package pe.edu.upeu.encapsulamiento.modelo;

public class Estudiante {

    //atributos
    private String codigo;
    private String carrera;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //metodos
    public void accion(){
        System.out.println("Estudiante accion: investigar y retudiar en la carrera de: " + carrera);
    }


}
