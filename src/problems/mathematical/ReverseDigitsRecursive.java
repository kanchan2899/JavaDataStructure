package problems.mathematical;

import java.util.Scanner;

public class ReverseDigitsRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("The number you want to reverse is " + x);
        System.out.println("And the reversed number is " + reverse(x));
    }

    static int reverse(int n){
        int digits = (int) Math.log10(n);
        if(n == 0)
            return 0;
        return ((int)(n%10 + Math.pow(10, digits)) + reverse(n/10));
    }
}
