package pe.edu.upeu.herencia;

public class Carro extends Vehiculo {
    String modelo = "Mustang";
    String placa = "PE-14454";
    String color = "Blanco";

    void caractiristicas(){
        System.out.println("Las caracteristicas de este carro son: ");
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+placa);
        System.out.println("Modelo: "+color);

    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.caractiristicas();
        carro.sonido();

    }
}
