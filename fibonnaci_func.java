import java.util.Scanner;

public class fibonnaci_func {
    public static int cal_Fibonacci(int num) {

        if (num <= 1) {
            return num;
        }
        return cal_Fibonacci(num - 1) + cal_Fibonacci(num - 2); // recursive function
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms in fibonacci series:");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(cal_Fibonacci(i) + " ");

        }
        {
            sc.close();
        }
    }
}
