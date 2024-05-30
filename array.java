import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 97;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
            {
                sc.close();
            }
        }
    }
}
