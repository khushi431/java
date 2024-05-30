class Pen {
    String color;

    public void printColor() {
        System.out.println("The color of this pen is:" + this.color);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // object created
        p1.color = "black"; // call object

        Pen p2 = new Pen();
        p2.color = "red";

        p1.printColor();
        p2.printColor();
    }
}
