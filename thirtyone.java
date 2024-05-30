import java.util.Scanner;

public class thirtyone {
    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calculateProduct(a, b);
        System.out.println("product of two numbers:" + product);
        {
            sc.close();
        }
    }
}
