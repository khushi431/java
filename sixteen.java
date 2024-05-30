import java.util.Scanner;
public class sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 0; i<=n; i= i+2){
        System.out.println("even numbers:" +i);
        }
        {
            sc.close();
        }
    }
}
