import java.util.*;

import bank.Account;
import newpackage.bank;

public class hierarichial_inheritance {
    class Shape {
        public void area() {
            System.out.println("displays area");
        }
    }

    class Triangle extends Shape {
        public void area(int l, int h) {
            System.out.println(0.5 * l * h);
        }
    }

    class Circle extends Shape {
        public void area(int r) {
            System.out.println(3.14 * r * r);
        }
    }

    public static void main(String[] args) {
        hierarichial_inheritance obj = new hierarichial_inheritance();
        Triangle triangle = obj.new Triangle();
        triangle.area(5, 10); // Prints the area of the triangle

        Circle circle = obj.new Circle();
        circle.area(4); // Prints the area of the circle

        Account account1 = new  Account();
        account1.name = "customer1";
    }

}
