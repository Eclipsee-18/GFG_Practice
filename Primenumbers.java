import java.util.*;

public class Primenumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sc.close();
        for(int i=n1;i<=n2;i++){
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
        
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
