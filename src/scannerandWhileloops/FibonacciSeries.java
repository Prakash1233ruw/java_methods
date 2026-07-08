package scannerandWhileloops;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number till");
	   int num= sc.nextInt();
	  int index=0; 
	  int first=0;
	  int second=1;
	 
	  int limit=10;
		while(first<=limit) {
			
			System.out.print(first+"  ");
		  	int next=first+second;	
		  	first=second;
		  	second=next;
		  	
			
		    index++;
		}	
	}
}
