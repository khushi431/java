import java.util.HashSet;

public class subsequence_hashset {
    public static void subSquences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(idx);
        // to be
        subSquences(str, idx + 1, newString + currChar, set); // time complexity ; O(n)

        // or not to be
        subSquences(str, idx + 1, newString, set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subSquences(str, 0, "", set);
    }

}
