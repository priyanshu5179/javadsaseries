package FRAMEWORK;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

//        arr.add(10);
        arr.add(50);
        arr.add(10);

        System.out.println(arr);

        arr.add(30);
        System.out.println(arr);

        arr.remove(0);
        System.out.println(arr);

        // addAll
        ArrayList<Integer> arr1 = new ArrayList<>();

        arr1.add(123);
        arr1.add(1234);

        arr.addAll(arr1);
        System.out.println(arr);

        arr.removeAll(arr1);
        System.out.println(arr);

        System.out.println(arr.size());

        System.out.println("print arr1: " + arr1);

        arr1.clear();
        System.out.println(arr1.size());

        // Traverse ArrayList using Iterator
        Iterator<Integer> iterator = arr.iterator();

        while (iterator.hasNext()) {
            System.out.println("element: " + iterator.next());
        }
        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(23);
        arr2.add(53);
        arr2.add(63);
        System.out.println(arr2.get(2));
        System.out.println("before:"+arr2);
        arr2.set(0,100);
        System.out.println("after:"+arr2);
    }
}