import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = sc.nextFloat();

        System.out.print("Enter second number: ");
        float b = sc.nextFloat();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                System.out.println("Result = " + (a / b));
                break;

            case '%':
                System.out.println("Result = " + (a % b));
                break;

            default:
                System.out.println("Invalid operator.");
        }

        sc.close();
    }
}