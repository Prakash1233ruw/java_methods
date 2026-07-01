package Methods2;
//A Krishnamurthy number (also known as a Strong number or Factorion) 
//is a natural number whose sum of the factorials of its digits equals the 
//original number. For instance,
//145 is a Krishnamurthy number because 1! + 4! + 5! = 1 + 24 + 120 = 145
public class KrishnamurthyNumber {
    public static void main(String[] args) {

//count

int res=0;

int value=145;

int num=value;

    while(num>0) {
    	int rem=num%10;
    	   res=res+factorialOfNum(rem);
    	num=num/10;
    }
    
    if(res==value) {
    	System.out.println(res+" is an KrishnamurthyNumber");
    }else {
    	System.out.println(res+"  not an KrishnamurthyNumber");

    }
}

	private static int factorialOfNum(int num) {
		int fact =1;
		int i=1;
		while(i<=num) {  
	       fact =fact*i;
	       i++;
		}
		return fact;
	}
    
    
}