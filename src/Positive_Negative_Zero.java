import java.util.Scanner;

public class Positive_Negative_Zero {

    public static void main(String[] args) { // main method
        Scanner scanner =new Scanner(System.in); // creact new object
        System.out.println("Enter the number: "); // print the number you enter
        int number=scanner.nextInt();
        if (number>0){
            System.out.println("you enter positive number"); // print the positive number
        }


    }
}
