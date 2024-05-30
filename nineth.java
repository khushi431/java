import java.util.Scanner;

public class nineth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(" It is an even number");
        } else {
            System.out.println(" It is odd number");
        }
        {
            sc.close();
        }

    }
}
