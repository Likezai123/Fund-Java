package pe.edu.upeu.encapsulamiento;

import pe.edu.upeu.encapsulamiento.modelo.Persona;

public class ClaseGeneral {

    public static void probarJugador(){
        Jugador jugador=new Jugador();
        jugador.setNombre("Messi");
        jugador.setApellido("Argentino");
        jugador.setEdad(25);
        jugador.setPosicion("Delantero");
        jugador.setNumeroCam(15);
        System.out.println(jugador);
    }

    public static void probar(){
        Estudiante estudiante = new Estudiante();
        estudiante.setCarrera("Ing. Sistemas");
        estudiante.setCodigo("200410564");
        estudiante.trabajo();
    }

    public static void main(String[] args) {
        Persona persona = new Persona();//objeto
        persona.setNombre("David");
        persona.setEdad(18);
        persona.setGenero('M');
        persona.saludo();
        System.out.println("Genero:"+persona.getGenero());
        probar();
        probarJugador();
    }

}