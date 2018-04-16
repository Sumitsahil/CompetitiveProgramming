package HackerRanks;
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         Map<String, Integer> sumit=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
           
            sumit.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
      
            if(sumit.containsKey(s))
            {
                  System.out.println(s+"="+sumit.get(s));
            }
             else
                {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
