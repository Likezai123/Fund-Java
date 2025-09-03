package pe.edu.upeu.polimorfismoAbstraccion;

public class Loro extends Animal {

    private String tipo = "ave";

    @Override
    public void animalSound() {
        System.out.println("despierta");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(this.tipo);
        System.out.println(super.tipo);
        System.out.println("sleeping");
    }
}
