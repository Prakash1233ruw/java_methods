package Methods2;

public class LargestOfThree {

    public static int largest(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        int result = largest(25, 80, 50);
        System.out.println("Largest Number = " + result);
    }
}
