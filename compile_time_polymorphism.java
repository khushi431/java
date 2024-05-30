public class compile_time_polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 20;

        s1.printInfo(s1.name, s1.age);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(String name) { // polymorphism : samde function is used to print info
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}
