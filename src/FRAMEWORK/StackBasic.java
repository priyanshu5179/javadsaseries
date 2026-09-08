package FRAMEWORK;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBasic {
    static void main() {
        Deque<Integer> stack= new ArrayDeque<>();
        stack.push(32);
        stack.push(52);
        stack.push(5432);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println( stack.peek());


    }
}
