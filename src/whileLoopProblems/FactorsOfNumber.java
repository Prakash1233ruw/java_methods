package whileLoopProblems;


public class FactorsOfNumber {

    public static void main(String[] args) {

        int num = 36;

        printFactors(num);
    }

    public static void printFactors(int num) {

        System.out.println("Factors of " + num + " are:");

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}