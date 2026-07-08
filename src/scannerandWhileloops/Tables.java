package scannerandWhileloops;

import java.util.Scanner;

public class Tables {
	public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number of tables");
	   int num= sc.nextInt();
	  int index=1;
	  int count=0;
		while(index<=num) {
		    tables(index);
		    
		   index++;

		}
	    System.out.println(count);

		
		
	}
	
	public static void tables(int num) {
		
		
		int i=1;
		while(i<=10) {
			 System.out.println(num+"*"+i+" ="+num*i);
			 i++;
		}
		
	}
}
