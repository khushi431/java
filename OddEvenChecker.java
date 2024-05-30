import java.util.Scanner;
public class OddEvenChecker{
    public static void main(String []args){
     int num ;
     Scanner sc = new Scanner(System.in);
     System.out.print("enter the number: ");
     num = sc.nextInt();
     if (num % 2 == 0){
        System.out.println(num + " is prime");
     }
     else{
        System.out.println(num + " is not prime");
     }
     sc.close();
    }
}
