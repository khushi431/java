class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("name of student 1:" + this.name);
        System.out.println("age of student 2:" + this.age);
    }

    Student( ) {
        System.out.println("constructor called");
    }
}

public class OOPS1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "khushi";
        s1.age = 22;
        s1.printInfo();

        Student s2 = new Student();
        s2.name = " aman";
        s2.age = 25;
        s2.printInfo();
        
    }
}
