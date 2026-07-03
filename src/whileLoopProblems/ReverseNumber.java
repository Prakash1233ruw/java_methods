package whileLoopProblems;

public class ReverseNumber {

    public static void main(String[] args) {
int res=0;
   int n=123577;
   int i=n;
   while(i>0) {
	  int rem=i%10;
	res = res*10+rem;
	  
	   i=i/10;
}
   System.out.print(res);
   
   
}
}

