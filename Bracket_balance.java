import java.util.*;

public class Bracket_balance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Str=sc.nextLine();
        sc.close();
        if(isBal(Str)){
        System.out.println("Is Balanced");
        }
        else{System.out.println("Not Balanced");}    
    }
    static boolean isBal(String Str)
    {
        Stack<Character> S=new Stack<>();
        for(int i=0;i<Str.length();i++)
        {
            char curr=Str.charAt(i);
            if(isopen(curr)){
                S.push(curr);
            }
            else{
                if(S.isEmpty()){
                    return false;
                }else if(!ismatch(S.peek(),curr)){
                    return false;
                }else{
                    S.pop();
                }
            }
        }return S.isEmpty();
    }
    static boolean isopen(char c){
        return c=='('||c=='{'||c=='[';
    }
    static boolean ismatch(char a,char b){
        return (a=='('&& b==')')||(a=='{'&& b=='}')||(a=='['&&b==']');
    }
}
