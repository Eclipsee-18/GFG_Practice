import java.util.*;

 class MajorElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Major Element is");
        System.out.println(majorityElement(a, size));
    }
    static int majorityElement(int a[], int size)
    {   
          
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                    int count = map.get(a[i]) +1;
                    if (count > a.length /2) {
                        
                        return a[i];
                    } else
                        map.put(a[i], count);

            }
            else
                map.put(a[i],1);
            }
            return -1;
    }
}
