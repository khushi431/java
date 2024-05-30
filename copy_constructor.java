
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("name of student 1:" + this.name);
        System.out.println("age of student 2:" + this.age);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }
}

public class copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 23;
        Student s2 = new Student(s1); // copy constructor call
        s2.printInfo();
    }
}
