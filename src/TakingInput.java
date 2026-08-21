import java.util.Scanner;

public class TakingInput {

    public static void main(StringBasic[] args) {

        int a = 5;
        int b = 5;
        System.out.println(a + b);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter my first number:");
        int firstnum = sc.nextInt();

        System.out.println("Enter my second number:");
        int secondnum = sc.nextInt();

        System.out.println("Sum = "+
                (firstnum + secondnum));

        sc.close();
    }
}
