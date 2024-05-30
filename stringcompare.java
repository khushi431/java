public class stringcompare {
    public static void main(String[] args) {
        String name1 = "khushi";
        String name2 = "khushi";

        // S1>S2 ; POSITIVE VALUE
        // S1==S2 : EQUAL
        // S1<S2 : NEGATIVE VALUE

        // if (new string("tony") == new string("tony")) {
        // System.out.println("strings are equal"); // gives wrong result
        // } else {
        // System.out.println("strings are not equal");
        // }

        if (name1.compareTo(name2) == 0) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }
    }
}
