package pe.edu.upeu.utils;

import java.util.Scanner;

public class Lectura {
    private Scanner sc = new Scanner(System.in);

    public int entero() { return sc.nextInt(); }
    public double decimal() { return sc.nextDouble(); }
    public String cadena() { return sc.next(); }
}
