package pe.edu.upeu.abspolimosfirmo;

public class Loro  extends Animal {

    private String tipo = "Ave";
    @Override
    public void emitirSonido(){
        System.out.println("Hey... no te duermas!");
    }

    @Override
    public void dormir(){
        super.dormir();
        System.out.println(super.tipo);
        System.out.println(this.tipo);
        System.out.println("No molestar ...Zzzzz Zzzz");
    }
}
