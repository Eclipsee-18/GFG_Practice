import java.util.*;
public class RatCountHouse {
    public static void main(String[] args) {
        int r,unit,n;
        Scanner sc=new Scanner(System.in); 
        r=sc.nextInt();
        unit=sc.nextInt();
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }sc.close();
        int amount,sum=0,count=0;
        amount=r*unit;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            count++;
            if(sum>=amount){break;}
            
        }
        System.out.println("Number of Houses"+count);
    }
}
