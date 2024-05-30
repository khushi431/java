import java.util.Scanner;
 public class greatest_of_three{
    public static void main(String[]args){
        int n1 , n2 , n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three no: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        if(n1 > n2)
        {
            if (n1>n3)
            System.out.println(n3+"  is greater");
            else
            System.out.println(n1+"  is greater");
        }
        else
        {
            if(n2>n3)
            System.out.println( n2 +" is greater");
            else
            System.out.println(n3+"  is greater");
        }

sc.close();
    }
 }