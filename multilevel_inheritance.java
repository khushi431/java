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

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        EquilateralTriangle triangle = new EquilateralTriangle();
        triangle.area(15, 4); // Calculate and display the area of the triang
    }
}
