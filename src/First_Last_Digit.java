import java.util.Scanner;

public class First_Last_Digit
{
    public static void main(String[] args) // main method
    {
        Scanner scanner= new Scanner(System.in); // creact object
        System.out.println("Enter any number to find of sum first and last digit : ");// print the statment
        int num=scanner.nextInt(); // input int value
        int lastdigit =num%10; // input int value
        int firstdigit=num/10000; // input int value
        int sum=firstdigit+lastdigit; // input int value
        System.out.println("addition of firstdigit & lastdigit " + "=" +sum); // print the statment
    }
}
