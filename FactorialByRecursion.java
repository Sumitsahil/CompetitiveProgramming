package HackerRanks;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class FactorialByRecursion {

	

	
	 
	    public static void main(String[] args) {
	       
	        Scanner in = new Scanner(System.in);
	        
	            while(in.hasNext())
	            {
	           long n = in.nextLong();
	        long abc=factorial(n);
	        System.out.println(abc);
	        }    
	    }
	    
	    public static long factorial(long n)
	        {
	        if(n==0 || n==1)
	            {
	            return 1;
	        }
	        else
	            return n*factorial(n-1);
	    }
	}

