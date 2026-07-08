package scannerandWhileloops;

import java.util.Scanner;

public class PrimeNumberCount {
	public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number till");
	   int num= sc.nextInt();
	    System.out.println("enter from when number");

	  int index=sc.nextInt();
	  int count=0;
		while(index<=num) {
		    if(isprime(index)) {
		    	count++;
		    }
		    
		   index++;

		}
	    System.out.println(count);

		
		
	}
	
	public static boolean isprime(int num) {
		
		if(num<2) {
			return false;
		}
		int i=2;
		while(i<=num/2) {
			if(num%i==0) {
				return false;
			}
			i++;
			
		}
		
	    System.out.println(num);

		return true;
		
	}
}
