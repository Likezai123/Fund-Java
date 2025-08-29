package pe.edu.upeu.claseinterna;

public class ClaseExterna {
    int a, b;
    class ClaseInterna1{
        double r;
        double sumar(){
            return a+b;
        }
    }
    class ClaseInterna2{
        double r;
        double restar(){
            r=a-b;
            return r;
        }
    }
}

class ClaseExterna2{
    public static void main(String[] args) {
        ClaseExterna ce = new ClaseExterna();
        ce.a=10;
        ce.b=20;
        ClaseExterna.ClaseInterna1 ci1 = ce.new ClaseInterna1();
        System.out.println(ci1.sumar());

        ClaseExterna.ClaseInterna2 ci2 = ce.new ClaseInterna2();
        ci2.restar();
        System.out.println(ci2.r);
    }
}