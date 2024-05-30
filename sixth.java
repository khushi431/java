import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        double circumference = 2 * Math.PI * r;
        System.out.println(area);
        System.out.println(circumference);
        {
            scanner.close();
        }

    }

}
