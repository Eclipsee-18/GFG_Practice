import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        sc.close();
        int n=S.length();
         
        System.out.println(isPalin(S,0,n-1));
    }
   static boolean isPalin(String S,int l,int r){
        if(l>=r)
        {return true;}
        if(S.charAt(l)!=S.charAt(r))
        {return false;}
        else
        {return isPalin(S, l+1, r-1);}
    }
}
