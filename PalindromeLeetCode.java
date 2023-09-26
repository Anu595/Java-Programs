class Solution{

    public boolean isPalindrome(int x){
boolean op=false;
int rem,sum=0,temp;
temp=x;

while(x>0){
// rem = x%10;
// sum = (sum * 10)+rem;
sum = (sum * 10)+(x%10);
x=x/10;
}

if(temp==sum) {op=true;}

else {op=false;}
        
return op;  
}
}


public class PalindromeLeetCode {
    public static void main(String[] args) {
        Solution s= new Solution();
        System.out.println(s.isPalindrome(12321));
    }
}
