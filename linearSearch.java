public class linearSearch {
    public static void main(String[] args) {
        int[] array= {9,1,2,4,2,8,9,2,4,5,3};

        int index = linSrch(array,22);

        if(index != -1){
            System.out.println("Element found at index : " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    private static int linSrch(int[] array, int value) {

        for(int i = 0; i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }  
}
