import java.util.Scanner;

public class getcircumference {
    public static double getCircumferenceFunction(double r) {
        double circumfernce = 2 * Math.PI * r;
        return circumfernce;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(getCircumferenceFunction(r));
        {
            sc.close();
        }
    }
}
