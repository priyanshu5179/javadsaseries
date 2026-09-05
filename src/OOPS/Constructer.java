package OOPS;

public class Constructer {
    public static class car{
        int seats;
        double no;
        String name;
        car(int x, String s, double d){
             seats=x;
             no=d;
             name=s;
        }
        void print(){
            System.out.println(name+" "+seats+" "+no);
        }
    }
    static void main() {
        car c =new car(43,"Priyanshu",54.54);
        car c1 =new car(4,"anshu",5.54);
        c.print();
    }
}
