package pe.edu.upeu.claseinterface;

public class Loro implements Animal {

    @Override
    public void emitirSonido() {
        System.out.println("Holaaa");

    }

    @Override
    public void dormir() {
        System.out.println("Zzzzz");

    }
}
