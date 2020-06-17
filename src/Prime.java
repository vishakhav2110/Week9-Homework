import java.util.Scanner;

public class Prime {


    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner( System.in ); // creact new object
        System.out.println( "Please Enter value" ); // print the enter value
        int numb1 = scanner.nextInt(); // input the value
        int j = 0;

        for (int i = 2; i<=numb1-1; i++) { // input the value
            if (numb1 % i == 0) {
                j = j + 1;
            }
        }
            if (j == 0) {
                System.out.println( numb1 + " : Prime Number" );// print the prime number
            } else
                System.out.println( numb1 + " : Not a Prime Number" ); // print the not prime number

            }
        }




