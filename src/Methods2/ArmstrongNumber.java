package Methods2;
//153 is an Armstrong number because it has 3 digits, and 1³ + 5³ + 3³ = 153. 
//Another example is 1634, where 1⁴ + 6⁴ + 3⁴ + 4⁴ = 1634
public class ArmstrongNumber {
    public static void main(String[] args) {

//count

int res=0;

int value=1634;

int num=value;
int cube=findPowerOf(value);

    while(num>0) {
    	int rem=num%10;
    	   res=res+(int)Math.pow(rem, cube);
    	num=num/10;
    }
    
    
   //int arm = (int)res;
    if(res==value) {
    	System.out.println(value+" is an armstrong");
    }else {
    	System.out.println(value+"  not an armstrong");

    }
}

	private static int findPowerOf(int i) {
		int count =0;
		while(i>0) {  
	    	count++;
	    	i=i/10;
		}
		return count;
	}
    
    
}