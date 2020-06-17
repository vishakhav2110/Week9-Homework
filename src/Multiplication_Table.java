import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String[] args) // main method
    {
        Scanner scanner=new Scanner(System.in); //  creact object
        System.out.println("please enter first number: "); // print the statment
        int num1=scanner.nextInt(); // input the value
        System.out.println("please enter second number:"); // peint the statment
        int num2=scanner.nextInt(); // input the value
        int value=1;
        do {
           // int a = num1 * value1;
          //  value1++;
        } while (value<=num2);
        System.out.println("");//
    }}
