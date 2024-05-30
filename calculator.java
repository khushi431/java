import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose operator:");
        int operator = sc.nextInt();
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();

        /**
         * 1 -> +
         * 2 -> -
         * 3 -> *
         * 4 -> /
         * 5 -> %
         */
        double result = 0.0;

        switch (operator) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;

            case 5:
                result = a % b;
                break;
            default:
                System.out.println("Invalid choice!");

        }
        System.out.println("Result: " + result);

        {
            sc.close();
        }
    }
}
