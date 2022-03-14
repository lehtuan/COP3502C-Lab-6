import java.util.Scanner;
public class lab6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to add or subtract numbers?");
        String addOrSubtract = scanner.next();

        if (addOrSubtract == "add" || addOrSubtract == "Add"){
            System.out.println("Input a number to add: ");
            int intputOne = scanner.nextInt();

            System.out.println("Input another number to add: ");
            int intputTwo = scanner.nextInt();

            System.out.println("Your sum is: " + " " + (intputOne + intputTwo));
        }
        else if(addOrSubtract == "subtract" || addOrSubtract == "Subtract"){
            System.out.println("Input a number to subtract: ");
            int intputOne = scanner.nextInt();

            System.out.println("Input another number to subtract: ");
            int intputTwo = scanner.nextInt();

            System.out.println("Your difference is: " + " " + (intputOne - intputTwo));
        }

    }

}