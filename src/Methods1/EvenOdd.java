package Methods1;

public class EvenOdd {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        if (isEven(8)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}