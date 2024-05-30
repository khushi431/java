import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        do {
            System.out.println("even number:" + i);
            i = i + 2;
        } while (i <= n);
        {
            sc.close();
        }
    }
}
