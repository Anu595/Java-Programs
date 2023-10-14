import java.util.LinkedList;
import java.util.Queue;

public class QuesDsaLinkedList {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>();

System.out.println(queue.isEmpty()); //true
queue.add("Luca");
queue.add("Karen");
queue.add("Mike");
queue.add("Paul");
queue.add("Chris");
System.out.println(queue.isEmpty());  //false


System.out.println(queue); //[Luca, Karen, Mike, Paul, Chris]

System.out.println(queue.peek());//Luca

queue.poll(); //removes element at the head
queue.poll();

System.out.println(queue);//[Mike, Paul, Chris]

System.out.println(queue.peek()); //Mike-- displays head of que, returns null if que empty
System.out.println(queue.element());//Mike-- displays head of que, returns exception if que empty

System.out.println(queue.size()); //3
System.out.println(queue.contains("Mike"));

queue.poll(); //removes element at the head
queue.poll();
queue.poll(); //removes element at the head
queue.poll();
System.out.println(queue);

    }
}
