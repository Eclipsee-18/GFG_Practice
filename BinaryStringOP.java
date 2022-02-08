import java.util.*;

public class BinaryStringOP {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    sc.close();
    int n=S.length();
    int res=S.charAt(0)-'0';
    for(int i=1;i<n;){
        char prev = S.charAt (i);
        i++;
        if (prev == 'A')
            res = res & (S.charAt (i) - '0');
        else if (prev == 'B')
            res = res | (S.charAt (i) - '0');
        else
            res = res ^ (S.charAt (i) - '0');
        i++;
    }
    System.out.println(res);
} 
}