import java.util.Scanner;

public class checkevenfunction {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isEven(n)) {
            System.out.println("number is even");
        } else {
            System.out.println("not even");
        }
        sc.close();

    }
}
