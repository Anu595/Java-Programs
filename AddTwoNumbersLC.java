import java.util.*;


class SolutionATN{

    public List atnSol(List<Integer> l1, List<Integer> l2){
 int a=0,b=0,c=0;
        System.out.println(l1);
        System.out.println(l2);
    
        ListIterator<Integer> itr = l1.listIterator(l1.size());

        while(itr.hasPrevious()){
         a= a*10 + itr.previous();
        }
        System.out.println(a);

         ListIterator<Integer> itr1 = l2.listIterator(l2.size());

        while(itr1.hasPrevious()){
         b= b*10 + itr1.previous();
        }
System.out.println(b);
c=a+b;
l1.clear();
while(c!=0){
l1.add(c%10);
c=c/10;
}
        return l1;

    }
}
public class AddTwoNumbersLC {
    public static void main(String[] args) {
    //    List<Integer> l1= new LinkedList<>(Arrays.asList(2,4,3));
    //     List<Integer> l2= new LinkedList<>(Arrays.asList(5,6,4));

       List<Integer> l1= new LinkedList<>(Arrays.asList(9,9,9,9,9,9,9));
        List<Integer> l2= new LinkedList<>(Arrays.asList(9,9,9,9));
        
    
SolutionATN atn= new SolutionATN();
System.out.println(atn.atnSol(l1,l2));
    }

}
