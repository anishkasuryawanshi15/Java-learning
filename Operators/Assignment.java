package Operators;
import java.util.*;
public class Assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Original value: " + num);

        num += 5;
        System.out.println("After += 5: " + num);

        num -= 3;
        System.out.println("After -= 3: " + num);

        num *= 2;
        System.out.println("After *= 2: " + num);

        num /= 4;
        System.out.println("After /= 4: " + num);

        num %= 3;
        System.out.println("After %= 3: " + num);

        sc.close();
    }
}