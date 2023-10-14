
class Solution {
	int[] getCumulativeSum (int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            arr[i] = sum;
            
        }

        return arr;
		
	}
}

public class cumulativeSum {
    public static void main(String[] args) {
        

    
    Solution s = new Solution();
    int inp = 3;
    int[] arr1={1,2,3,4};
    int[] arr2 = {1,1,1,1,1};
    int[] arr3 = {1,3,5,7,9};
    s.getCumulativeSum(arr1);

    }
}
