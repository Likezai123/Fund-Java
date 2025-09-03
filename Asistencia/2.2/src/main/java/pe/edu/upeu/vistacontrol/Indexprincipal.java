package pe.edu.upeu.vistacontrol;

import pe.edu.upeu.utils.Lectura;
import pe.edu.upeu.utils.Utilitarios;

public class Indexprincipal {
    static Lectura leer = new Lectura();

    public static void menu() {
        System.out.print("""
                MENÚ PRINCIPAL
                1. Trabajadores
                2. Estudiantes
                3. Salir
                """);
        System.out.print("Seleccione una opción [1-3]: ");
    }

    public static void inicio() {
        int opcion;
        do {
            Utilitarios.lineasenblanco(2);
            menu();
            opcion = leer.entero();
            switch (opcion) {
                case 1 -> Indextrabajador.inicio();
                case 2 -> Indexestudiante.inicio();
                case 3 -> Utilitarios.salir();
                default -> Utilitarios.error(1);
            }
        } while (opcion != 3);
    }
}
