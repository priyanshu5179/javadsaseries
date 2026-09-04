package OOPS;
class student{
    String name;
    private int rno;
    double cgpa;
}
public class PrivateKeyword {
//    public static class student{
//        String name;
//        private int rno;
//        double cgpa;
//    }
    static void main() {
        student s1 =new student();
        System.out.println(s1.cgpa);
        s1.cgpa=34.5;
        s1.name="priyanshu";
//        s1.rno =45;
    }
}
