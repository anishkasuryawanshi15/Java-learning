import java.util.*;

public class else_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num > 0) {
            System.out.println("Number is positive.");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is neither positive nor negative.");
        }
        
        scanner.close();
    }
}