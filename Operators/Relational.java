package Operators;
import java.util.*;
public class Relational {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first numbers: ");
        int a = sc.nextInt();   

        System.out.println("Enter second numbers: ");
        int b = sc.nextInt();

        // various relational operation
        System.out.println("a Equal to b: " + (a == b));
        System.out.println("a Not Equal to b: " + (a != b));
        System.out.println("a Greater than b: " + (a > b));
        System.out.println("a Less than b: " + (a < b));
        System.out.println("a Greater than or equal to b: " + (a >= b));
        System.out.println("a Less than or equal to b: " + (a <= b));

        sc.close();
    }
}