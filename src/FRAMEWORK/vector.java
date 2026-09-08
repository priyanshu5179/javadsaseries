import java.util.Vector;
import java.util.Iterator;
import java.util.Collections;

    public static void main(String[] args) {

        // Create Vector
        Vector<Integer> arr = new Vector<>();

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
        Vector<Integer> arr1 = new Vector<>();

        arr1.add(123);
        arr1.add(1234);

        arr.addAll(arr1);
        System.out.println(arr);

        // Remove all values of arr1 from arr
        arr.removeAll(arr1);
        System.out.println(arr);

        // Check Vector size
        System.out.println(arr.size());

        System.out.println("Print arr1: " + arr1);

        // Clear all values from Vector
        arr1.clear();
        System.out.println(arr1.size());

        // Traverse Vector using Iterator
        Iterator<Integer> iterator = arr.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // Another Vector
        Vector<Integer> arr2 = new Vector<>();

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

        System.out.println("Print entire vector: " + arr);

        // Sort Vector
        Collections.sort(arr);

        System.out.println("After sorting: " + arr);

        // Clone Vector
        Vector<Integer> newarr = (Vector<Integer>) arr.clone();

        System.out.println("Print newarr: " + newarr);

        // Create new Vector
        Vector<Integer> marks = new Vector<>();

        // Vector HAS capacity-related methods
        marks.ensureCapacity(100);

        System.out.println("Capacity of marks: " + marks.capacity());

        // Check whether Vector is empty
        System.out.println("Is marks empty? " + marks.isEmpty());

        // Find index of an element
        System.out.println("Index of 63: " + arr.indexOf(63));


        // ==========================================
        // Vector specific operations
        // ==========================================

        Vector<Integer> v = new Vector<>();

        v.add(10);
        System.out.println(v);

        // Add at first position
        v.add(0, 1);
        System.out.println(v);

        // Add at last position
        v.add(v.size(), 100);
        System.out.println(v);

        // Remove last element
        v.remove(v.size() - 1);
        System.out.println(v);

        // Get first element
        System.out.println("First element: " + v.get(0));

        // Get last element
        System.out.println("Last element: " + v.get(v.size() - 1));

        // peek() equivalent
        // Vector does not have peek()
        System.out.println("Peek: " + v.get(0));

        // Remove first element and return it
        System.out.println("Before: " + v);

        int first = v.remove(0);

        System.out.println("Polling: " + first);
        System.out.println("After: " + v);
    }
