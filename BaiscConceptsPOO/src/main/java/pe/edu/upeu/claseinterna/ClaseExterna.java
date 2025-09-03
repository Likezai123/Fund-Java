package pe.edu.upeu.claseinterna;

public class ClaseExterna {
    int a, b;

    class ClaseInterna1{
        double r;

        double sumar (){
            return a+b;
        };
    }

    class ClaseInterna2{
        double r;
        double restar (){
            return a-b;
        }
    }
}

class ClaseExterna3{
    public static void main(String[] args) {
        ClaseExterna ce = new ClaseExterna();
        ce.a=10;
        ce.b=20;
        ClaseExterna.ClaseInterna1 claseInterna1 = ce.new ClaseInterna1();
        ClaseExterna.ClaseInterna2 claseInterna2 = ce.new ClaseInterna2();

        System.out.println(claseInterna1.sumar());
        System.out.println(claseInterna2.restar());

    }
}
