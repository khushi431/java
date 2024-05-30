import java.util.Scanner;

public class bit_toggler {
    public static void main(String[] args) {
        System.out.println(" enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        sc.close();

        int new_number = toggleBit(n, pos);
        System.out.println("The number after toggling bit at position " + pos + " is: " + new_number);
    }

    public static int toggleBit(int n, int pos) {
        int maskbit = 1 << pos;
        int new_number = n ^ maskbit; // bitwise xor
        return new_number;

    }

}
