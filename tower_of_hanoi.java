public class tower_of_hanoi {
    public static void tower0fHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("transfer disk" + n + "from " + src + "to" + dest);
            return ;
        }
        tower0fHanoi(n - 1, src, dest, help);
        System.out.println("transfer disk" + n + "from " + src + "to" + dest);
        tower0fHanoi(n - 1, help, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        tower0fHanoi(n, "S", "H", "D");
    }
}
