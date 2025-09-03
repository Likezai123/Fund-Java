package pe.edu.upeu.encapsulamiento;

import pe.edu.upeu.encapsulamiento.modelo.Estudiante;
import pe.edu.upeu.encapsulamiento.modelo.Persona;
import pe.edu.upeu.encapsulamiento.modelo.Players;

public class ClaseGeneral {

    public static void testearPlayer() {

        Players messi = new Players();
        messi.setNombre("Messi");
        messi.setApellido("Argentino");
        messi.setEdad(25);
        messi.setPosicion("Delantero");
        messi.setNumCamiseta(5);

        System.out.println(messi);

    }

    public static void  test (){

        Estudiante estudiante = new Estudiante();
        estudiante.setCarrera("Ing. Sistemas");
        estudiante.setCarrera("202512417");
        estudiante.accion();

    }

    public static void main(String[] args) {
        Persona juan = new Persona(); //instancismos objeto juan a partir de la clase persona

        //atributos del objeto
        juan.setNombre("Juan");
        juan.setEdad(25);
        juan.setSexo('M');
        juan.saludo();

        test();

        testearPlayer();
    }
}
