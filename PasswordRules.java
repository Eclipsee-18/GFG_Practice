
import java.util.*;
public class PasswordRules {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       sc.close();
       int n=str.length();
       boolean Perfect=true;
        if (n < 4)
           { System.out.println("Length error");
              Perfect=false;}
        if (str.charAt (0) >= '0' && str.charAt (0) <= '9')
            {System.out.println("First Digit Error");
            Perfect=false;}

        int num = 0, cap = 0;
        for (int i = 0; i < n; i++)
        {
            if (str.charAt (i) == ' ' || str.charAt (i) == '/')
                {System.out.println("Space Error");
                Perfect=false;}
            if (str.charAt (i) >= 'A' && str.charAt (i) <= 'Z')
                cap++;
            if (str.charAt (i) >= '0' && str.charAt (i) <= '9')
                num++;
        }
        if (cap > 0 && num > 0)
            {}
        else
            {System.out.println("Cap error");
            Perfect=false;}
        if(Perfect){
            System.out.println("Password Perfect");
        }    
    
   } 
}
