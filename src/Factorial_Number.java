import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) { // main method
        Scanner scanner =new Scanner(System.in); // crect new object
        System.out.println("Enter the number: "); // print for enter number
        int no = scanner.nextInt(); // input
        int fact =1;
        for (int i=1;i<=no;i++)
        {
            fact=fact*i;

        }
        System.out.println("factorial of " +no+ " is " +fact);// print for factorial of fact
}}
