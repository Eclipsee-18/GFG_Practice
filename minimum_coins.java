import java.util.*;

public class minimum_coins{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(mincoins(n, a));
    }
    static int mincoins(int n,int a[])
    {
        if(n==0) return 0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(n-a[i]>=0){
            int subans=mincoins(n-a[i],a);
            if(subans!=Integer.MAX_VALUE && subans+1<ans){
                ans=subans+1;
            }
            }
        }
        return ans;
    }
}
