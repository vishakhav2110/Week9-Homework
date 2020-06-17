import java.util.Scanner;

public class Odd_Even
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // main method
        System.out.println("Enter value: "); // print the  value
        int num1= scanner.nextInt(); // inout the value
        int odd=0;int even=0;int sumeven=0;int sumodd=0;int result=0; //
        if (num1>=1000 && num1 <10000);
        while (num1>0)
        {
            result = num1 % 10;
            if (num1 % 2 == 0) ;
            {
                sumeven = sumeven + result;
                int i = even++;
            } else
            {
                sumodd = sumodd + result;
            }
            num1 = num1 / 10;
            System.out.println( "sum of odd number are : " + sumodd );// print th sumodd number
            System.out.println( "number of odd  are : " + odd ); // print the odd number
            System.out.println( "sum of even number are : " + sumeven ); // print the sumeven number
            System.out.println( " number of even are:" + even ); // print the even number
        }
         //  else
        {
            System.out.println("please enter five digit only "); // print the five digit number only



}}  }
