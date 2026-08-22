public class Array {
    public static void main(StringBasic[] args) {

//        int arr[];
//        arr = new int[5];
//
//        int brr[] = {12, 4324, 323};
//
//        System.out.println("First element: " + brr[0]);
//         for(int val :brr){
//             System.out.println(val);
//
//      for (int index = 0; index < brr.length; index++) {
//          System.out.println(brr[index]);
//        }
//    }
//}
//    NEW CDOE

//                int[] arr = new int[5];
//                Scanner sc = new Scanner(System.in);
//
//                int n = arr.length;
//
//                for (int i = 0; i < n; i++) {
//                    System.out.print("Provide input for index " + i + ": ");
//                    arr[i] = sc.nextInt();
//                }
//
//                System.out.println("Your array contains:");
//
//                for (int val : arr) {
//                    System.out.println(val);
//                }
//
//                sc.close();
//            }
//        }
//
//        int arr[] = {9, 1, 1, 2, 1};
//        int ans = 1;
//        int n = arr.length;
//        for(int i = 0;i<= n - 1;i++){
//            int value = arr[i];
//            ans = ans * value;
//        }
//        System.out.println(ans);
//    }
//}
//finding maximum value

//        int arr[] = {43, 53, 53, 5354, 44, 43};
//        int maxvalue = arr[1];
//        int n = arr.length;
//        for (int i = 0; i <= n - 1; i++) {
//            if (arr[i] > maxvalue) {
//                maxvalue = arr[i];
//            }
//        }
//        System.out.println(maxvalue);
//    }
//}

//                int[][] arr;
//                arr = new int[3][4];
//
//                int[][] brr = {
//                        {43, 3},
//                        {53, 53},
//                        {353, 3336},
//                        {3534, 345}
//                };
//
//                int rowlength = brr.length;
//
//                for (int rowindex = 0; rowindex <= rowlength - 1; rowindex++) {
//                    int collength = brr[rowindex].length;
//
//                    for (int colindex = 0; colindex <= collength - 1; colindex++) {
//                        System.out.print(brr[rowindex][colindex] + " ");
//                    }
//
//                    System.out.println();
//                }
//            }
//        }


//    TAKING ARRAY FROM USER
//                int[][] arr;
//                arr = new int[3][4];
//
//                Scanner sc = new Scanner(System.in);
//
//                // Input
//                for (int i = 0; i <= arr.length - 1; i++) {
//                    for (int j = 0; j <= arr[i].length - 1; j++) {
//                        System.out.println("Provide the value of array [" + i + "][" + j + "]:");
//                        arr[i][j] = sc.nextInt();
//                    }
//                }
//
//                // Output
//                int rowlength = arr.length;
//
//                for (int rowindex = 0; rowindex <= rowlength - 1; rowindex++) {
//                    int collength = arr[rowindex].length;
//
//                    for (int colindex = 0; colindex <= collength - 1; colindex++) {
//                        System.out.print(arr[rowindex][colindex] + " ");
//                    }
//
//                    System.out.println();
//                }
//
//                sc.close();
//            }
//        }
//ANOTHER CODE
//        int arr[][] = {{12, 333, 123}, {123, 123, 322}};
//        int sum = 0;
//        for (int i = 0; i <= arr.length - 1; i++) {
//            for (int j = 0; j <= arr[i].length - 1; j++) {
//                int value = arr[i][j];
//                sum = sum + value;
//            }
//        }
//        System.out.println(sum);
//    }
//}
    // multiplying array
//        int arr[][] = {{12, 333, 123}, {123, 123, 322}};
//        int ans=1;
//        for (int i = 0; i <= arr.length - 1; i++) {
//            for (int j = 0; j <= arr[i].length - 1; j++) {
//                int value = arr[i][j];
//                ans = ans *value;
//            }
//        }
//        System.out.println(ans);
//    }
//}
//
//FINDING MAX VALUE IN ARRAY
        int arr[][] = {{12, 333, 123}, {123, 123, 322}};
        int maxvalue=arr[0][0];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                if(arr[i][j]>maxvalue) {
                    maxvalue = arr[i][j];
                }
            }
        }
        System.out.println(maxvalue);
    }
}
















