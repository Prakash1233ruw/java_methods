package whileLoopProblems;

public class PalindromeNumber {

    public static void main(String[] args) {
int reverse=0;
   int n=9889;
   int i=n;
   while(i>0) {
	  int rem=i%10;
	reverse = reverse*10+rem;
	  
	   i=i/10;
}
   
   
   if(reverse==n) {
   System.out.print(n+" is a palindrome");
   }else {
	   System.out.print(n+" is not  a palindrome");
 
   }
 
}
}

