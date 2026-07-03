package whileLoopProblems;

public class SumOfDigits {

	public static void main(String[] args) {
		int sum=0;
		int n=1235;
		int i=n;
		while(i>0) {
			int rem=i%10;
			sum=sum+rem;

			i=i/10;
		}
		System.out.print(sum);


	}
}

