import java.util.*;

public class PriorityQue {
    public static void main(String[] args) {
        Queue<Double> q = new PriorityQueue<>(Collections.reverseOrder()); 
        q.offer(3.0);
        q.offer(2.0);
        q.offer(4.5);
        q.offer(2.5);
        q.offer(3.4);
         while(!q.isEmpty()){
            System.out.println(q.poll()); }

     Queue<String> q1 = new PriorityQueue<>(Collections.reverseOrder());
        q1.offer("B");
        q1.offer("C");
        q1.offer("A");
        q1.offer("D");
        q1.offer("F");

        while(!q1.isEmpty()){
            System.out.println(q1.poll()); 
        }
    }
}
