import java.util.Scanner;

public class thirtythree {
    public static boolean isPrime(int n) {
        int i;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                break;
        }
        return i > n / 2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println("prime: " + n);
        } else {
            System.out.println("not prime: " + n);
        }
        {
            sc.close();
        }

    }

}
