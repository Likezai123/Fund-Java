package pe.edu.upeu.claseinterface;

public class Gato implements Animal {
    @Override
    public void emitirSonido() {
        System.out.println("Miau, miau");
    }

    @Override
    public void dormir() {
        System.out.println("Zzz, zzz");
    }
}
