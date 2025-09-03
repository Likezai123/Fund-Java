package pe.edu.upeu.encapsulamiento.modelo;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodo de la clase, en simples palabras accion de la clase
    public void saludo() {
        System.out.println("Hola mi nombre es "+nombre+" y mi edad es: "+edad);
    }
}
