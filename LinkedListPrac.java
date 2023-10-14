import java.util.LinkedList;

public class LinkedListPrac {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList<>();


        //Linked List as a stack
        ll.push("A");
        ll.push("B");
        ll.push("C");
        ll.push("D");
        ll.push("F");
        ll.pop();
        System.out.println(ll);

        //Linked list as a queue
         LinkedList<String> ll1= new LinkedList<>();
        ll1.offer("A");
         ll1.offer("B");
          ll1.offer("C");
           ll1.offer("D");
            ll1.offer("F");
             System.out.println(ll1);
            ll1.poll();
            System.out.println(ll1);
            ll1.add(3, "K");
            System.out.println(ll1);
            ll1.remove("K");
             System.out.println(ll1);
             System.out.println(ll1.indexOf("C"));
             System.out.println(ll1.peekFirst());
             System.out.println(ll1.peekLast());
             ll1.addFirst("L");
             
    }
}
