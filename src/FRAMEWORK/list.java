import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<Integer> arr = new LinkedList<>();

        // Add values
        arr.add(50);
        arr.add(10);

        System.out.println(arr);

        arr.add(30);
        System.out.println(arr);

        // Remove value using index
        arr.remove(0);
        System.out.println(arr);

        // addAll()
        LinkedList<Integer> arr1 = new LinkedList<>();

        arr1.add(123);
        arr1.add(1234);

        arr.addAll(arr1);
        System.out.println(arr);

        // Remove all values of arr1 from arr
        arr.removeAll(arr1);
        System.out.println(arr);

        // Check the LinkedList size
        System.out.println(arr.size());

        System.out.println("Print arr1: " + arr1);

        // Clear all values from LinkedList
        arr1.clear();
        System.out.println(arr1.size());

        // Traverse LinkedList using Iterator
        Iterator<Integer> iterator = arr.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // Another LinkedList
        LinkedList<Integer> arr2 = new LinkedList<>();

        arr2.add(23);
        arr2.add(53);
        arr2.add(63);

        // get()
        System.out.println(arr2.get(2));

        System.out.println("Before: " + arr2);

        // set() - change element at index
        arr2.set(0, 100);

        System.out.println("After: " + arr2);

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

        System.out.println("Print entire list: " + arr);

        // Sort LinkedList
        Collections.sort(arr);

        System.out.println("After sorting: " + arr);

        // Clone LinkedList
        LinkedList<Integer> newarr = (LinkedList<Integer>) arr.clone();

        System.out.println("Print newarr: " + newarr);

        // Create new LinkedList
        LinkedList<Integer> marks = new LinkedList<>();

        // LinkedList does NOT have ensureCapacity()
        // marks.ensureCapacity(100);  // ❌ Not possible

        // Check whether LinkedList is empty
        System.out.println("Is marks empty? " + marks.isEmpty());

        // Find index of an element
        System.out.println("Index of 63: " + arr.indexOf(63));
    }