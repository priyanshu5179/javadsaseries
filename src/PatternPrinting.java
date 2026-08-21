
 public class PatternPrinting {
     public static void main() {
//                int n = 5;
//
//                for (int row = 1; row <= n; row++) {
//                    for (int col = 1; col<=row; col++) {
//                        System.out.print("* ");
//                    }
//                    System.out.println();
         //NEXT CODE
//                int n = 5;
//
//                for (int row = 1; row <= n; row++) {
//                    for (int col = 1; col<=n-row+1; col++) {
//                        System.out.print("* ");
//                    }
//                    System.out.println();

//                NEXT CODE
//                        int n = 4;
//
//                        for (int row = 1; row <= n; row++) {
//
//                            // Print spaces
//                            for (int col = 1; col <= n - row; col++) {
//                                System.out.print(" ");
//                            }
//
//                            // Print stars
//                            for (int col = 1; col <= 2 * row - 1; col++) {
//                                System.out.print("*");
//                            }
//
//                            // Move to next line
//                            System.out.println();
//                        }
//                    }
//                }
//               NEXT CODE
//                int n = 4;
//
//                for (int row = 1; row <= n; row++) {
//
//                    // Print spaces
//                    for (int col = 1; col <= row-1; col++) {
//                        System.out.print(" ");
//                    }
//
//                    // Print stars
//                    for (int col = 1; col <= 2*n-2*row - 1; col++) {
//                        System.out.print("*");
//                    }
//
//                    // Move to next line
//                    System.out.println();
//                }
//            }
//       NEXT CODE
                 int n = 4;

                 for (int row = 1; row <= n; row++) {
                     for (int col = 1; col <= 6; col++) {

                         if (row == 1 || row == n || col == 1 || col == 6) {
                             System.out.print("* ");
                         } else {
                             System.out.print("  ");
                         }
                     }
                     System.out.println();
                 }
             }
         }
