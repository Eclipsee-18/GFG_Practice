import java.util.*;

public class GCD {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter how many numbers");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("Enter Numbers");
       for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
       }
       sc.close();
       System.out.println(gcdn(a, n));
    }
    static int gcd(int a,int b)
    {
        if(a==0)
        {return b;}
        if(b==0)
        {return a;}
        return gcd(b,a%b);
    }
    static int gcdn(int a[],int n)
    {
        int result=a[0];
        for(int i=0;i<n;i++)
        {
            result=gcd(a[i], result);
        }
        return result;
    }
}
