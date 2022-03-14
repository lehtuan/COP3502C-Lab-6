import java.util.Scanner;
public class lab6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number to add: ");
        int intputOne = scanner.nextInt();

        System.out.println("Input another number to add: ");
        int intputTwo = scanner.nextInt();

        System.out.println("Your sum is: " + " " + intputOne + intputTwo);
    }

}