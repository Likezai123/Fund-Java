package pe.edu.upeu.vistacontrol;

import java.util.ArrayList;
import pe.edu.upeu.modelo.Trabajador;
import pe.edu.upeu.utils.Lectura;
import pe.edu.upeu.utils.Utilitarios;

public class Indextrabajador {
    private static ArrayList<Trabajador> trabajadores = new ArrayList<>();
    private static Lectura leer = new Lectura();

    public static void datosdeinstalacion() {
        Trabajador t1 = new Trabajador(1200, "Ventas", "Vendedor", 10, "Juan", "12345678");
        trabajadores.add(t1);
        Trabajador t2 = new Trabajador(4000, "Desarrollador", "Sistemas", 15, "Pedro", "22222222");
        trabajadores.add(t2);
    }

    public static void agregar() {
        System.out.println("Agregar Trabajador");
        System.out.print("> ID: ");
        int id = leer.entero();
        System.out.print("> Nombre: ");
        String nombre = leer.cadena();
        System.out.print("> DNI: ");
        String dni = leer.cadena();
        System.out.print("> Salario: ");
        double salario = leer.decimal();
        System.out.print("> Cargo: ");
        String cargo = leer.cadena();
        System.out.print("> Area de Trabajo: ");
        String area_trabajo = leer.cadena();
        Trabajador trabajador = new Trabajador(salario, area_trabajo, cargo, id, nombre, dni);
        trabajadores.add(trabajador);
        System.out.println("<Se agregó un nuevo trabajador>");
    }

    public static void listar() {
        int numero = 0;
        for (Trabajador trabajador : trabajadores) {
            numero++;
            System.out.println("Trabajador Nro " + numero);
            System.out.println("* ID: " + trabajador.getIdpersona());
            System.out.println("* Nombre: " + trabajador.getNombre());
            System.out.println("* DNI: " + trabajador.getDni());
            System.out.println("* Area: " + trabajador.getArea_trabajo());
            System.out.println("* Cargo: " + trabajador.getCargo());
            System.out.println("* Salario: " + trabajador.getSalario());
            System.out.println("*********************************");
        }
    }

    // 🔎 Nuevo método para buscar trabajador por DNI
    public static void buscar() {
        System.out.print("Ingrese el DNI del trabajador a buscar: ");
        String dniBuscado = leer.cadena();

        boolean encontrado = false;
        for (Trabajador t : trabajadores) {
            if (t.getDni().equals(dniBuscado)) {
                System.out.println(">> Trabajador encontrado:");
                System.out.println("* ID: " + t.getIdpersona());
                System.out.println("* Nombre: " + t.getNombre());
                System.out.println("* DNI: " + t.getDni());
                System.out.println("* Area: " + t.getArea_trabajo());
                System.out.println("* Cargo: " + t.getCargo());
                System.out.println("* Salario: " + t.getSalario());
                System.out.println("*********************************");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún trabajador con el DNI: " + dniBuscado);
        }
    }

    public static void menu() {
        System.out.print("""
                DATOS TRABAJADOR
                1. Agregar
                2. Listar
                3. Buscar
                4. Volver al menú principal
                """);
        System.out.print("Seleccione una opción [1-4]: ");
    }

    public static void inicio() {
        int opcion;
        do {
            menu();
            opcion = leer.entero();
            switch (opcion) {
                case 1 -> agregar();
                case 2 -> listar();
                case 3 -> buscar(); // 🔎 se agregó al switch
                case 4 -> Utilitarios.volver();
                default -> Utilitarios.error(1);
            }
        } while (opcion != 4);
    }
}
