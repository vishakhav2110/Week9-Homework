import java.util.Scanner;

public class PalindromeNumb {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner( System.in );// new object
        System.out.println( "Enter value to check Palindrome numbers or not  : " );// print the statment
        int value = scanner.nextInt();// input value
        System.out.println();

        int p = value; // input value
        int rev = 0;
        int a;

        while (p != 0) {
            a = p % 10;
            rev = rev * 10 + a;
            p = p / 10;
        }

        if (value == rev) {
            System.out.println( value + " : -- > is a Palindrome number" );// print the palindrome number
        }
        else {
            System.out.println( value + ": -- > is not Palindrome number" );// print the not palindrome number
        }

    }
}