import java.util.Scanner;

public class PowerOfTwoChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 
        scanner.close();

        if (isPowerOfTwo(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }

    // Function to check if a number is a power of 2
    public static boolean isPowerOfTwo(int number) {
        if (number <= 0) {
            return false;
        }

        // Bitwise AND of the number and its decrement should be zero
        // for the number to be a power of 2
        return (number & (number - 1)) == 0;
    }
}










