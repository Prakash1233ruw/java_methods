package whileLoopProblems;

public class ProductOfDigits {

	public static void main(String[] args) {
		int product=1;
		int n=12352;
		int i=n;
		while(i>0) {
			int rem=i%10;
			product=product*rem;

			i=i/10;
		}
		System.out.print(product);


	}
}

