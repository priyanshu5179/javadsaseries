package OOPS;

public class Polymorphism {
    static class dog {
        void speak(){
            System.out.println("bhau");
        }
    }
    public static class lion{

        void speak(){
            System.out.println("huu");
        }
    }
    public static class human{
        void speak(){
            System.out.println("hello");
        }
    }
    public static class cat{
        void speak(){
            System.out.println("mewoo");
        }
    }
    static void main() {
        cat c = new cat();
        dog d= new dog();
        lion l =new lion();
        human h= new human();

     c.speak();
        d.speak();
        h.speak();
        l.speak();
    }
}
