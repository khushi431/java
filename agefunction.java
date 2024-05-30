import java.util.Scanner;

public class agefunction {
    public static boolean isEligible(int age) {
        if (age >= 18) {
            System.out.println("eligible to vote");
            return true;
        }
        System.out.println("not eligible for vote");
        return false;
    }

    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        System.out.println(isEligible(age));
        {
            sc.close();
        }
    }
}
