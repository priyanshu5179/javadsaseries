import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class StringBasic {
//        String name1 = "love";
//        String name2 = "Love";
//
//        if (name1.equals(name2)) {
//            System.out.println("The strings are equal");
//        } else {
//            System.out.println("Not equal");
//        }
//    }
//}
//        String name1 = "love";
//        String name2 = "Love";
//
//        if (name1.equalsIgnoreCase(name2)) {
//            System.out.println("The strings are equal");
//        } else {
//            System.out.println("Not equal");
//        }
//    }
//}
//TAKING INPUT USING TWO METHOD
//        Scanner sc = new Scanner(System.in);
//        System.out.println("provide string 1:");
//        String str = sc.nextLine();//this code take all output
//        System.out.println("provide string are :" + str);
//        System.out.println("provide second string :");
//        String str1 = sc.next();//thisd
//        System.out.println("provide string are " + str1);
//    String str="priyanshu";
//        System.out.println(str.length());
//       System.out.println(str.charAt(1));


    //NEW CODE
//        String  str = "  ";
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());
//        System.out.println(str.length());
//          String name  ="  love  ";
//          name =name.trim();//it is use for remove the the space front and back
//        System.out.println(name);
//        System.out.println(name.substring(3 , 6));
//        System.out.println(name.contains("lover"));

//          int num =4535;
//          String str =String.valueOf(num);
//        System.out.println(num+1);
//        System.out.println(str+1);
//
//           String name ="my name is priyanshu";
//        System.out.println(name.endsWith("priyanshu"));
//        System.out.println(name.startsWith("my"));
//    }
//}
//      String name="priyanshu";
//      char[] crr=name.toCharArray();
//      for(char ch:crr){
//          System.out.println("vale of char:"+ch);
//        }
//       String input = "my name is Priyanshu";
//       String [] words=input.split(" ");
//       for(String str:words){
//           System.out.println(str);


//        String name="priyanshu";
//        name=name.replace('a','e');
//        System.out.println(name);

    //  PRACTICE QUESTION

    //count vowels in string

//            static int countInVowels(String str) {
//                int count = 0;
//
//                for (int i = 0; i < str.length(); i++) {
//                    char ch = str.charAt(i);
//
//                    if (ch == 'a' || ch == 'e' || ch == 'i' ||
//                            ch == 'o' || ch == 'u' ||
//                            ch == 'A' || ch == 'E' || ch == 'I' ||
//                            ch == 'O' || ch == 'U') {
//
//                        count++;
//                    }
//                }
//
//                return count;
//            }
//
//            public static void main(String[] args) {
//                String str = "priyanshu";
//
//                System.out.println(countInVowels(str));
//            }
//        }

//   REVERSE THE STRING

//    public class StringBasic {
//
//        static String reverseTheString(String str) {
//            String reverse = "";
//
//            for (int i = str.length() - 1; i >= 0; i--) {
//                char ch = str.charAt(i);
//                reverse = reverse + ch;
//            }
//
//            return reverse;
//        }
//
//        public static void main(String[] args) {
//            String str = "priyanshu";
//
//            System.out.println(reverseTheString(str));
//        }
//


        static void main() {
            String str = "moom";
            String reversed = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed = reversed + str.charAt(i);
            }

            if (str.equals(reversed)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }














