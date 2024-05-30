public class backtracking {

    public static void printPerm(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) { // traverse in string
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newstr, perm + currChar, idx + 1); // time complexity: O(n*n!)

        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPerm(str, "", 0);
    }
}
