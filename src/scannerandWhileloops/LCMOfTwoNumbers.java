package scannerandWhileloops;

import java.util.Scanner;

public class LCMOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Start from the larger number
        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {

            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("LCM = " + lcm);
                break;
                
            }

            lcm++;
        }
    }
}