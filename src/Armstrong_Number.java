import java.util.Scanner;

public class Armstrong_Number
{
    public static void main(String[] args) // main method
    {  int num=0; int number=0; int temp=0;int total=0; // input value
        System.out.println("Enter 3 digit number:"); // print for statment
        Scanner scanner = new Scanner(System.in); // creact new objcet
        num=scanner.nextInt();

        for (; number !=0; number /=10);{
            temp=number% 10;
            total = total +temp * temp * temp;

    }  if (total == number);
        System.out.println( num+ " is an Armstrong number");// print there statment

    }
}
