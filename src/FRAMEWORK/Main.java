package FRAMEWORK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//create array
        ArrayList<Integer> arr = new ArrayList<>();
//add the value
        arr.add(50);
        arr.add(10);

        System.out.println(arr);

        arr.add(30);
        System.out.println(arr);
//remove the value from the array using this method
        arr.remove(0);
        System.out.println(arr);

        // addAll
        ArrayList<Integer> arr1 = new ArrayList<>();

        arr1.add(123);
        arr1.add(1234);

        arr.addAll(arr1);
        System.out.println(arr);
//remove the all the value from the array
        arr.removeAll(arr1);
        System.out.println(arr);
//check the array size
        System.out.println(arr.size());

        System.out.println("print arr1: " + arr1);
//clar the all the value in the array
        arr1.clear();
        System.out.println(arr1.size());

        // Traverse ArrayList using Iterator
        Iterator<Integer> iterator = arr.iterator();
//hash is using for going next index in the array
        while (iterator.hasNext()) {
            System.out.println("element: " + iterator.next());
        }

        // Another ArrayList
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr2.add(23);
        arr2.add(53);
        arr2.add(63);

        System.out.println(arr2.get(2));

        System.out.println("before: " + arr2);
// it is for insert the new element the idenx
        arr2.set(0, 100);

        System.out.println("after: " + arr2);

        // toArray()
        Object[] arr3 = arr2.toArray();

        for (Object obj : arr3) {
            System.out.println(obj);
        }

        // contains()
        System.out.println(arr2.contains(63));

        // Add more elements
        arr.add(70);
        arr.add(60);

        System.out.println("print entire list: " + arr);

        // Sort ArrayList
        Collections.sort(arr);

        System.out.println("print entire list: " + arr);
        //creating new array for clone the value in the new array
        ArrayList<Integer> newarr= (ArrayList<Integer>) arr.clone();
        System.out.println("print newarr :"+newarr);
        // crating new array for checking the array is empyt or not 
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks.isEmpty());
        // find the index of the elements
        System.out.println(arr.indexOf(63));



    }
}