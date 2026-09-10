package Operators;
import java.util.*;
public class Logical{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // AND (&&)
        System.out.println("Eligible for admission: " + (age >= 18 && marks >= 50));

        // OR (||)
        System.out.println("Eligible for scholarship: " + (marks >= 90 || age < 25));

        // NOT (!)
        System.out.println("Not eligible for admission: " + !(age >= 18 && marks >= 50));

        sc.close();
    }
}