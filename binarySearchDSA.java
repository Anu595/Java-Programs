import java.util.Arrays;

public class binarySearchDSA {
    public static void main(String[] args) {
        int array[] =new int[10];
        int target =23;

        for(int i= 0 ; i<array.length;i++){
            array[i] = i;            
        }

        // int index = Arrays.binarySearch(array,target);

         int index = binarySearch(array,target);

       System.out.println(index);
        if(index == -1){
            System.out.println(target  + " not found");
        }
        else{
            System.out.println("Element found at :  " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length -1;

        while(low <= high){

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle : " + value);

            if(value < target ) {
                low = middle + 1;
                System.out.println("value < target");
            }
            else if (value > target){
                    high = middle - 1;
                   System.out.println("value > target"); 
                   
            }
            else return middle;
        }

        return -1;
    }
}
