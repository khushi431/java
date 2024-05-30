public class string {
    public static void main(String[] args) {
        String firstName = "khushi";
        String secondName = "arora";

        String fullName = firstName + " " + secondName;
        System.out.println(fullName.length());

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i)); // charAt
        }
    }

}
