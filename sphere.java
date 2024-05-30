import java.util.Scanner;
class sphere{
    public static void main(String args[])
    {
        double r , vol , area;
        Scanner sc = new Scanner (System.in);
        System.out.print("enter radius: ");
        r = sc.nextInt();
        vol = (4 * Math.PI * Math.pow(r, 2))/3;
        area = Math.PI * Math.pow(r,2);
        System.out.println("volume: " + vol);
        System.out.println("area: " + area);
sc.close();

    }
    
    
}