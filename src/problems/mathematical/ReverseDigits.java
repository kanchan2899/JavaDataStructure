package problems.mathematical;

import java.util.Scanner;

// Reverse digits of a number N.
// Input 200 Output 2
// Input 122 Output 221
public class ReverseDigits {

    public static void main(String[] args) {
        System.out.println("Please enter a number to reverse: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("The number you want to reverse is " + x);
        System.out.println("And the reversed number is " + reverse(x));
    }

    private static int reverse(int x) {
        int rev = 0;
        while(x != 0){
            rev = rev * 10 + x % 10;
            x = x/10;
        }
        return rev;
    }

}
