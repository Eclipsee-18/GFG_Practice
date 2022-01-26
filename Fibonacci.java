import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      sc.close();
      System.out.print(n1+" "+n2);
        printfibonacci(n-2);
    }
    static int n1=0,n2=1,n3=0;
    static void printfibonacci(int n)
    {
      
        if(n>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printfibonacci(n-1);
        }
    }

}
