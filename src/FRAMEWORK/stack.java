import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

    public static void main(String[] args) {

        // ==========================================
        // 1. Create Stack
        // ==========================================

        Stack<Integer> arr = new Stack<>();

        // Add values
        arr.push(50);
        arr.push(10);

        System.out.println(arr);

        arr.push(30);
        System.out.println(arr);


        // ==========================================
        // 2. Remove element
        // ==========================================

        System.out.println("Removed: " + arr.pop());
        System.out.println(arr);


        // ==========================================
        // 3. addAll()
        // ==========================================

        Stack<Integer> arr1 = new Stack<>();

        arr1.push(123);
        arr1.push(1234);

        arr.addAll(arr1);

        System.out.println(arr);


        // ==========================================
        // 4. removeAll()
        // ==========================================

        arr.removeAll(arr1);

        System.out.println(arr);


        // ==========================================
        // 5. size()
        // ==========================================

        System.out.println("Size: " + arr.size());

        System.out.println("Print arr1: " + arr1);


        // ==========================================
        // 6. clear()
        // ==========================================

        arr1.clear();

        System.out.println("Size after clear: " + arr1.size());


        // ==========================================
        // 7. Iterator
        // ==========================================

        Iterator<Integer> iterator = arr.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }


        // ==========================================
        // 8. Another Stack
        // ==========================================

        Stack<Integer> arr2 = new Stack<>();

        arr2.push(23);
        arr2.push(53);
        arr2.push(63);

        System.out.println("Stack: " + arr2);


        // ==========================================
        // 9. get()
        // ==========================================

        System.out.println("Element at index 2: " + arr2.get(2));


        // ==========================================
        // 10. set()
        // ==========================================

        arr2.set(0, 100);

        System.out.println("After set: " + arr2);


        // ==========================================
        // 11. toArray()
        // ==========================================

        Object[] arr3 = arr2.toArray();

        for (Object obj : arr3) {
            System.out.println(obj);
        }


        // ==========================================
        // 12. contains()
        // ==========================================

        System.out.println("Contains 63? " + arr2.contains(63));


        // ==========================================
        // 13. Add more elements
        // ==========================================

        arr.push(70);
        arr.push(60);

        System.out.println("Stack: " + arr);


        // ==========================================
        // 14. Sort Stack
        // ==========================================

        Collections.sort(arr);

        System.out.println("After sorting: " + arr);


        // ==========================================
        // 15. Clone Stack
        // ==========================================

        Stack<Integer> newarr = (Stack<Integer>) arr.clone();

        System.out.println("New Stack: " + newarr);


        // ==========================================
        // 16. isEmpty()
        // ==========================================

        Stack<Integer> marks = new Stack<>();

        System.out.println("Is marks empty? " + marks.isEmpty());


        // ==========================================
        // 17. indexOf()
        // ==========================================

        System.out.println("Index of 63: " + arr.indexOf(63));


        // ==========================================
        // 18. Stack operations
        // ==========================================

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);


        // ==========================================
        // 19. peek()
        // ==========================================

        System.out.println("Top element: " + stack.peek());

        System.out.println("Stack after peek: " + stack);


        // ==========================================
        // 20. pop()
        // ==========================================

        System.out.println("Before pop: " + stack);

        System.out.println("Popped: " + stack.pop());

        System.out.println("After pop: " + stack);


        // ==========================================
        // 21. empty()
        // ==========================================

        System.out.println("Is stack empty? " + stack.empty());


        // ==========================================
        // 22. search()
        // ==========================================

        System.out.println("Position of 10: " + stack.search(10));
}