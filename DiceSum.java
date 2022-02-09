import java.util.*;
public class DiceSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        sc.close();
        int n=0;
        for(int i=1;i<=6;i++){
            if(sum-i<=6&&sum-i>0){
                n++;
            }
        }
        System.out.println(n);
    }
}
