package pe.edu.upeu.utils;

public class Utilitarios {
    public static void lineasenblanco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    public static void salir() {
        System.out.println("Saliendo del sistema...");
        System.exit(0);
    }

    public static void volver() {
        System.out.println("Volviendo al menú principal...");
    }

    public static void error(int tipo) {
        if (tipo == 1) {
            System.out.println("Opción no válida. Intente de nuevo.");
        }
    }
}
