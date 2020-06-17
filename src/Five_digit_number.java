import java.util.Scanner;

public class Five_digit_number
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // main method
        System.out.println("Enter value");// print the value
        int val1=scanner.nextInt(); //input the value
        System.out.println(); // print the stetmnet
  int a;
  int b=0;
        while (val1>=1) {
            a = val1 % 10;
            b = a + b;
            val1 = val1 / 10;
        }
        System.out.println(b);// print the b value


}}
