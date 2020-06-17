import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) { // mian method
        Scanner scanner = new Scanner( System.in );// new object
        System.out.println( "Enter value to reverse it : " );// print the value to reverse it
        int value = scanner.nextInt(); // input the value
        System.out.println();
        int a;
        int b = 0;
        while (value != 0) {
            a = value % 10;
            b = b * 10 + a;
            value = value / 10;
        }
        System.out.println( b );// print the b value

    }
}

