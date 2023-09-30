import java.util.Stack;

public class StackDsa {
    public static void main(String[] args) {
        Stack<String> stack= new Stack<String>();

        System.out.println(stack.empty());//true
        stack.push("Minecraft"); 
        stack.push("Counterstrike");
        stack.push("age of empires");
        stack.push("bridge");
        stack.push("Hellgame");
         System.out.println(stack.empty());//false
         System.out.println(stack);//[Minecraft, Counterstrike, age of empires, bridge, Hellgame]

         stack.pop(); //pop 5 times --exception EmptyStackException
         System.out.println(stack);//[Minecraft, Counterstrike, age of empires, bridge]

         String agame = stack.pop(); //
         System.out.println(agame); //bridge
         System.out.println(stack); //[Minecraft, Counterstrike, age of empires]

         System.out.println(stack.peek());//age of empires
         System.out.println(stack);//[Minecraft, Counterstrike, age of empires]

         System.out.println(stack.search("age of empires")); //1
         System.out.println(stack.search("Counterstrike")); //2
         System.out.println(stack.search("bridge")); //-1

         stack.push("Minecraft"); //duplicate
         System.out.println(stack);//[Minecraft, Counterstrike, age of empires, Minecraft]
         System.out.println(stack.search("Minecraft"));//1


    }
}
