package pe.edu.upeu.abspolimosfirmo;

public abstract class Animal {
    protected String tipo = "XXX";
    public abstract void emitirSonido();

    public void dormir(){
        System.out.println("El animal duerme");
    }
}
