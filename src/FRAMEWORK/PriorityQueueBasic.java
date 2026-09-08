package FRAMEWORK;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {
    static void main() {
        Queue<Integer> pq=new PriorityQueue<>();
        //default behaviour > integere  low level  high priority <<-minheap
        //maxheap   integer high value high priority
        //pq >>- stringh compretor
        pq.add(32);
        pq.add(82);
        pq.add(72);
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
