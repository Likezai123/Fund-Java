package pe.edu.upeu.polimorfismoAbstraccion;

public abstract class Animal {

    protected String tipo = "algo";

    //clase abstracta
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzz");
    }
}
