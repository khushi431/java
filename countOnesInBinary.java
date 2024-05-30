import java.util.Scanner;

public class countOnesInBinary {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = countOnes(number);
        System.out.println("Number of 1's in the binary representation: " + count);
        sc.close();

    }
    // Function to count the number of 1's in the binary representation of a number

    public static int countOnes(int number) {
        int count = 0;

        // Iterate through each bit in the binary representation
        while (number != 0) {
            // If the current bit is 1, increment the count
            if ((number & 1) == 1) {
                count++;
            }
            // Right shift the number by 1 to move to the next bit
            number = number >> 1;
        }

        return count;
    }
}
