import java.util.*;
public class Simple_Bill_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Total: " + total);

        //18% tax
        float tax = total + (0.18f * total);

        System.out.println("Bill after 18% tax: " + tax);

        sc.close();
    }
}
