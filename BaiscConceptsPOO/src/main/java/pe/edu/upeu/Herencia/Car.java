package pe.edu.upeu.Herencia;

public class Car extends Vehicle{
    String modelo = "Corolla";
    String placa = "PE-55545";
    String color = "Blanco";

    void caracteristicas(){
        System.out.println("Las caracteristicas de mi auto son: ");
        System.out.println("Marca: " + marca); //Atributo heredaro
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Color: " + color);

    }

    public static void main(String[] args) {
        Car miAuto = new Car();
        miAuto.caracteristicas();
        miAuto.sonido(); //metodo heredado
    }
}
