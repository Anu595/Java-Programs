class SolutionLong{
public String lcp(String[] S){
if (S == null || S.length == 0) return "";
        for (int i = 0; i < S[0].length() ; i++){
            char c = S[0].charAt(i);
            for (int j = 1; j < S.length; j ++) {
                if (i == S[j].length() || S[j].charAt(i) != c)
                    return S[0].substring(0, i);             
            }
        }
        
        return S[0];
       } }   

public class LongestCommonPrefix {
    public static void main(String[] args) {
        SolutionLong sol = new SolutionLong();
        String[] strEg= {"flower","flow","flight"};
        // String[] strEg= {"dog","racecar","car"};
        // String[] strEg= {"a"};
        System.out.println(sol.lcp(strEg));
    }
}

