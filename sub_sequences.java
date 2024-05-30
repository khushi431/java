public class sub_sequences {
    public static void subSquences(String str, int idx, String newString ) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        subSquences(str, idx + 1, newString + currChar); // time complexity ; O(n)

        // or not to be
        subSquences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSquences(str, 0, "");
    }
}
