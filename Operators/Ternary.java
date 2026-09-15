package Operators;
import java.util.*;
public class Ternary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String result = (marks >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);

        sc.close();
    }
}