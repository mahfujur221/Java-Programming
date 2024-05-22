package arithmeticoperator;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a any number=");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.print("Even Number");
        } else {
            System.out.println("ODD Number");
        }
    }
}
