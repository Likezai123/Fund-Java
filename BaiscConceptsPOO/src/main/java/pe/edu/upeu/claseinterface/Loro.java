package pe.edu.upeu.claseinterface;

public class Loro implements Animal{
    @Override
    public void emitirSonido() {
        System.out.println("Hola, hola");
    }

    @Override
    public void dormir() {
        System.out.println("Zzz, zzz");
    }
}
