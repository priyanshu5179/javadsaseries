package FRAMEWORK;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    static void main() {
         Queue<Integer> q= new LinkedList<>();
         q.offer(34);
        q.offer(45);
        q.offer(344);
        System.out.println(q);
        System.out.println("removing:"+q.poll());

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
    }
}
