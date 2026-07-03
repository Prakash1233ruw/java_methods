package whileLoopProblems;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int pn=0;
		int n=1238956;
		int i=n;
		while(i>0) {
			int rem=i%10;
			boolean isPrime=checkthePrime(rem);
			if(isPrime) {
				pn=pn*10+rem;
			}
			i=i/10;
		}
		System.out.print(pn);


	}

	private static boolean checkthePrime(int rem) {
		if(rem<2) {
			return false;
		}
		int i=2;
		while(i*i<=rem) {
			if(rem%i==0) {
				return false;
			}
			i++;
		}
		return true;

	}
}

