
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("name of student 1:" + this.name);
        System.out.println("age of student 2:" + this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class parameterized_constructor {
    public static void main(String[] args) {
        Student s1 = new Student("aman", 24);

        s1.printInfo();

        Student s2 = new Student("khushi", 20);

        s2.printInfo();

    }
}
