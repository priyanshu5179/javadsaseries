//public class Methods {
//    static void printtable() {
//        for (int a = 1; a <= 10; a++) {
//            int ans = 2 * a;
//            System.out.println("<>=" + ans);
//        }
//
//    }
//
//    static void main() {
//        System.out.println("start");
//        Methods.printtable();
//        System.out.println("end");
//    }
//
//    static void sum(int x,int y){
//        System.out.println("ans=" + (x + y));
//    }
//    static void main() {
//        sum(23, 453);
//    }

public class Methods {
//
//    static void printtable() {
//        for (int a = 1; a <= 10; a++) {
//            int ans = 2 * a;
//            System.out.println("<> = " + ans);
//        }
//    }
//
//    static void sum(int x, int y) {
//        System.out.println("ans = " + (x + y));
//    }
//
//    public static void main(StringBasic[] args) {
//        System.out.println("start");
//
//        printtable();
//
//        sum(23, 453);
//
//        System.out.println("end");
//    }
//

    /// /    use double methods
//}
//    static void main(){
//    int result=add(12,34);
//    int  result2=add(12,43,43);
//    System.out.println("result=" + result);
//        System.out.println("result2="  + result2);
//}
//    static int add(int x,int y,int r){
//    int add =(x+y+r);
//    return add;
//    }
//    static int add(int x,int y){
//    int sum = (x+y);
//            return sum;
//
//    }
//
//   // static void main(){
//    int num=5;
//        System.out.println(num);
//        solve(num);
//    }
//    static int solve(int num ){
//    int num=(num*10);
//        System.out.println(num);
//    }
//    static void main() {
//        System.out.println("Hi");
//        solve();
//        System.out.println("Bye");
//    }
//
//    static void solve() {
//        System.out.println("Hey");
//        int ans = add(1, 2);
//        System.out.println(ans);
//        System.out.println("Bye");
//    }
//
//    static int add(int a, int b) {
//        System.out.println("Hello");
//        int ans = a + b;
//        return ans;
//    }
//}
// 2 numbers
    static int add(int p, int q) {
        int sum = p + q;
        return sum;
    }

    // 3 numbers — same name, different parameters
    static int add(int p, int q, int r) {
        int ans = p + q + r;
        return ans;
    }

    public static void main(String[] args) {
        int ans1 = add(1, 2);      // calls the 2-parameter version
        int ans2 = add(1, 2, 3);   // calls the 3-parameter version

        System.out.println("ans1: " + ans1);  // ans1: 3
        System.out.println("ans2: " + ans2);  // ans2: 6
    }
}