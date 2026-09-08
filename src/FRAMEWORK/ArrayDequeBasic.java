package FRAMEWORK;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBasic {
    static void main() {
        Deque<Integer> q= new ArrayDeque<>();
        q.offer(23);
        q.offer(222);
        q.offer(243);
        System.out.println(q);
        q.pollLast();
        System.out.println(q);

        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.peekFirst());

        System.out.println(q.peekLast());


    }
}
