import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("enter number to be searched");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < size; i++) { // size = numbers.length
            if (numbers[i] == x) {
                System.out.println("number found at index:" + i);
            }
        }
        {
            sc.close();
        }
    }
}
