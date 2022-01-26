import java.util.*;
class RotateArray
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size");
        int n=sc.nextInt();
        System.out.println("times to rotate");
        int d=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        rotateArr(arr, d, n);
    }
    
    static void rotateArr(int arr[], int d, int n)
   {
       d=d%n;
       int i,j,k,temp;
       int g=gcd(d,n);
       for(i=0;i<g;i++)
       {
           temp=arr[i];
           j=i;
           while(true){
               k=j+d;
               if(k>=n)
               k=k-n;
               if(k==i)
               break;
               arr[j]=arr[k];
               j=k;
           }
           arr[j]=temp;
       }
       for( i=0;i<n;i++){
           System.out.print(arr[i]);
       }
   }
   static int gcd(int a,int b)
   {
       if(b==0)
       return a;
       else
       return gcd(b,a%b);
   }
}