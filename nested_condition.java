import java.util.Scanner;

public class nested_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("numbers are equal");
        } else if (a > b) {
            System.out.println("number is greater");
        } else {
            System.out.println("number is lesser");
        }
        {
            sc.close();
        }

    }
}
