package arithmeticoperator;

import java.util.Scanner;

public class ControlStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any number");
        num = input.nextInt();

        if (num > 0) {
            System.out.print("Positive number");
        }

        if (num < 0) {
            System.out.print("Negetive number");
        } else {
            System.out.print("Zero");
        }

    }

}
