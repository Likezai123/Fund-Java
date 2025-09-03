package pe.edu.upeu.vistacontrol;

import java.util.ArrayList;
import pe.edu.upeu.modelo.Estudiante;
import pe.edu.upeu.utils.Lectura;
import pe.edu.upeu.utils.Utilitarios;

public class Indexestudiante {
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static Lectura leer = new Lectura();

    public static void datosdeinstalacion() {
        Estudiante e1 = new Estudiante("20241001", "Ingeniería de Sistemas", 22, "Juan", "00000001");
        estudiantes.add(e1);
    }

    public static void agregar() {
        System.out.println("Agregar Estudiante");
        System.out.print("> ID: ");
        int id = leer.entero();
        System.out.print("> Nombre: ");
        String nombre = leer.cadena();
        System.out.print("> DNI: ");
        String dni = leer.cadena();
        System.out.print("> Código: ");
        String codigo = leer.cadena();
        System.out.print("> Carrera: ");
        String carrera = leer.cadena();
        Estudiante estudiante = new Estudiante(codigo, carrera, id, nombre, dni);
        estudiantes.add(estudiante);
        System.out.println("<Se agregó un nuevo estudiante>");
    }

    public static void listar() {
        int numero = 0;
        for (Estudiante estudiante : estudiantes) {
            numero++;
            System.out.println("Estudiante Nro " + numero);
            System.out.println("* ID: " + estudiante.getIdpersona());
            System.out.println("* Nombre: " + estudiante.getNombre());
            System.out.println("* DNI: " + estudiante.getDni());
            System.out.println("* Código: " + estudiante.getCodigo());
            System.out.println("* Carrera: " + estudiante.getCarrera());
            System.out.println("*********************************");
        }
    }

    public static void menu() {
        System.out.print("""
                DATOS ESTUDIANTE
                1. Agregar
                2. Listar
                3. Volver al menú principal
                """);
        System.out.print("Seleccione una opción [1-3]: ");
    }

    public static void inicio() {
        int opcion;
        do {
            menu();
            opcion = leer.entero();
            switch (opcion) {
                case 1 -> agregar();
                case 2 -> listar();
                case 3 -> Utilitarios.volver();
                default -> Utilitarios.error(1);
            }
        } while (opcion != 3);
    }
}
