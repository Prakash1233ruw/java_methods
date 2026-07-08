package scannerandWhileloops;

import java.util.Scanner;

public class GCDOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int i = 1;
        int gcd = 1;

        // Find the smaller number
        int min = (num1 < num2) ? num1 : num2;

        while (i <= min) {

            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }

            i++;
        }

        System.out.println("GCD = " + gcd);
    }
}