import java.util.*;
public class character_count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        charactercount(str);
    }
    static void charactercount(String str)
    {
        HashMap<Character,Integer> count=new HashMap<Character,Integer>();
        char[] strarr=str.toCharArray();
        for(char c:strarr){
        if(count.containsKey(c)){
            count.put(c,count.get(c)+1);
        }
        else{
            count.put(c,1);
        }
        }
        for(Map.Entry<Character,Integer> entry:count.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
