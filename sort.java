import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < size - 1; i++) {
            if (number[i] > number[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");

        }
        {
            sc.close();
        }
    }
}
