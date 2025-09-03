package pe.edu.upeu.claseinterface;

public class ClaseGeneral {

    public static void main(String[] args) {
        Animal loro, gato;

        gato = new Gato();
        gato.emitirSonido();
        gato.dormir();

        loro = new Loro();
        loro.emitirSonido();
        loro.dormir();

    }

}
