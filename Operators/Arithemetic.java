package Operators;

import java.util.Scanner;

public class Arithemetic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        int a = sc.nextInt();
        System.out.println("Enter second numbers: ");
        int b = sc.nextInt();

       // various arithemetic operation
       System.out.println("Addition: " + (a + b));
       System.out.println("Subtraction: " + (a - b)); 
       System.out.println("Multiplication: " + (a * b));
       System.out.println("Division: " + (a / b));
       System.out.println("Modulus: " + (a % b));

       sc.close();

    }    
}
