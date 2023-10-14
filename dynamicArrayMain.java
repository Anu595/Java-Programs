

public class dynamicArrayMain {
    public static void main(String[] args) {
        dynamicArray dynArray = new dynamicArray(5);
        // System.out.println(dynArray.capacity);

        dynArray.add("A");
        dynArray.add("B");
        dynArray.add("C");
        dynArray.add("D");
        dynArray.add("E");
        dynArray.add("F");

        dynArray.delete("A");
        dynArray.delete("B");
        dynArray.delete("C");

    //     dynArray.insert(0, "X");
    //     dynArray.delete("A");
    //    System.out.println( dynArray.search("C"));
    //    System.out.println( dynArray.search("Z"));


        System.out.println(dynArray);
        System.out.println("size: " + dynArray.size);
        System.out.println("capacity: " + dynArray.capacity);
        System.out.println("empty: " + dynArray.isEmpty());
       
    }
}
