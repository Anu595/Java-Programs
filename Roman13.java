
class SolutionR {
    public int romanToInt(String s) {
         int intNum=0,intNum1=0;
        // int I= 1,V= 5, X= 10, L= 50, C= 100, D= 500, M= 1000;
        for(int i=1;i<s.length();i++){

            if((i==s.length()-1)){
                      if(s.charAt(i-1)=='I'&&s.charAt(i)=='V'){
                intNum= intNum + 4;
               
            }
            else   if(s.charAt(i-1)=='I'&&s.charAt(i)=='X'){
                intNum= intNum + 9;
              
            }
              else   if(s.charAt(i-1)=='X'&&s.charAt(i)=='L'){
                intNum= intNum + 40;
              
            }
              else   if(s.charAt(i-1)=='X'&&s.charAt(i)=='C'){
                intNum= intNum + 90;
               
            }
              else   if(s.charAt(i-1)=='C'&&s.charAt(i)=='D'){
                intNum= intNum + 400;
               
            }
              else   if(s.charAt(i-1)=='C'&&s.charAt(i)=='M'){
                intNum= intNum + 900;
               
            }
            else if(s.charAt(i)=='I'){
                intNum= intNum + 1;  
            }
             else   if(s.charAt(i)=='V'){
                intNum= intNum + 5;  
            }
             else   if(s.charAt(i)=='X'){
                intNum= intNum + 10;  
            }
             else   if(s.charAt(i)=='L'){
                intNum= intNum + 50;  
            }
             else   if(s.charAt(i)=='C'){
                intNum= intNum + 100;  
            }
             else   if(s.charAt(i)=='D'){
                intNum= intNum + 500;  
            }
             else   if(s.charAt(i)=='M'){
                intNum= intNum + 1000;  
            }
                }
  
if(i<s.length()-1){
            if(s.charAt(i-1)=='I'&&s.charAt(i)=='V'){
                intNum= intNum + 4;
                i++;
            }
            else   if(s.charAt(i-1)=='I'&&s.charAt(i)=='X'){
                intNum= intNum + 9;
                i++;
            }
              else   if(s.charAt(i-1)=='X'&&s.charAt(i)=='L'){
                intNum= intNum + 40;
                i++;
            }
              else   if(s.charAt(i-1)=='X'&&s.charAt(i)=='C'){
                intNum= intNum + 90;
                i++;
            }
              else   if(s.charAt(i-1)=='C'&&s.charAt(i)=='D'){
                intNum= intNum + 400;
                i++;
            }
              else   if(s.charAt(i-1)=='C'&&s.charAt(i)=='M'){
                intNum= intNum + 900;
                i++;
            }
              else   if(s.charAt(i-1)=='I'){
                intNum= intNum + 1;  
            }
             else   if(s.charAt(i-1)=='V'){
                intNum= intNum + 5;  
            }
             else   if(s.charAt(i-1)=='X'){
                intNum= intNum + 10;  
            }
             else   if(s.charAt(i-1)=='L'){
                intNum= intNum + 50;  
            }
             else   if(s.charAt(i-1)=='C'){
                intNum= intNum + 100;  
            }
             else   if(s.charAt(i-1)=='D'){
                intNum= intNum + 500;  
            }
             else   if(s.charAt(i-1)=='M'){
                intNum= intNum + 1000;  
            }
        }
            
            System.out.println(intNum);
            }
            // intNum=intNum+intNum1;
            System.out.println("Final: "+ intNum);
        return intNum;
    }
}

public class Roman13 {
public static void main(String[] args) {
    SolutionR sol = new SolutionR();
    sol.romanToInt("LVIII");

}    
}
