public class BasicMaths {
//    static void printnum(int num) {
//        while(num!=0){
//            int digit =num%10;
//            System.out.println(digit);
//            num=num/10;
//        }
//
//    }
//    static void main() {
//        int num=23452;
//        printnum(num);
//    }
//}
//static int countnum(int num) {
//    int count=0;
//    while(num!=0){
//        int digit =num%10;
//        count++;
//        num=num/10;
//    }
//     return count;
//}
//    static void main() {
//        int num=23452;
//        int ans =countnum(num);
//        System.out.println(ans);
//    }
//}
//static int sumofnum(int num) {
//    int sum=0;
//    while(num!=0){
//        int digit =num%10;
//        sum=sum+digit;
//        num=num/10;
//    }
//    return sum;
//}
//    static void main() {
//        int num=23452;
//        int ans =sumofnum(num);
//        System.out.println(ans);
//    }
//}
//static int reverseofnum(int num) {
//    int sum=0;
//    while(num!=0){
//        int digit =num%10;
//        sum=sum*10+digit;
//        num=num/10;
//    }
//    return sum;
//}
//    static void main() {
//        int num=23452;
//        int ans =reverseofnum(num);
//        System.out.println(ans);
//    }
//}

//        static boolean reverseOfNum(int num) {
//            int original = num;
//            int reverse = 0;
//
//            while (num != 0) {
//                int digit = num % 10;
//                reverse = reverse * 10 + digit;
//                num = num / 10;
//            }
//
//            return original == reverse;
//        }
//
//        static void main() {
//            int num = 121;
//
//            if (reverseOfNum(num)) {
//                System.out.println("Palindrome");
//            } else {
//                System.out.println("Not Palindrome");
//            }
//        }
//    }

//    //CHECK PRIME NUMBER
//    static boolean checkprimenum(int num) {
//        for (int i = 2; i <= num - 1; i++) {
//            if (num % i == 0) {
//                return true;
//            }
//        }
//        return false;
//    }
//    static void main() {
//        int num = 5;
//        System.out.println(checkprimenum(num));
//    }
//}

//ANOTHER METHOD

//    static  boolean checkprimenum(int num) {
//        for (int i = 2; i*i<= num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    static void main() {
//        int num = 7;
//        System.out.println(checkprimenum(num));
//    }
//}

    //FINDING ARMASTRONG NUMBER
//IN ARMASTRONG THE  CUBE OF ALL THE NO IS EQUAL TO SAME NUMBER
//    static boolean CHECKARMASTRONGofnum(int num) {
//        int sum = 0;
//        int originalnum = num;
//
//        while (num != 0) {
//            int digit = num % 10;
//            int cubeofdigit = digit * digit * digit;
//            sum = sum + cubeofdigit;
//            num = num / 10;
//        }
//
//        if (sum == originalnum) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    static void main() {
//        int num = 12;
//
//        boolean ans = CHECKARMASTRONGofnum(num);
//
//        System.out.println(ans);
//    }
//}

//find all divisors of perfect num
//
//PRINT 1 TO N NUMBER OF PRIME
    static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void main(String[] args) {

        int n = 50;

        for (int i = 1; i <= n; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}