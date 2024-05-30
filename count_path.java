public class count_path {
    public static int countPath(int i, int j, int n, int m) {
        if (i == n - 1 && j == n - 1) {
            return 1; // base cases
        }
        if (i == n || j == m) {
            return 0;
        }
        // move downwards
        int downPaths = countPath(i + 1, j, n, m); // recursion conditions

        // move rightwards
        int rightPaths = countPath(i, j + 1, n, m);
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPaths = countPath(0, 0, n, m); 
        System.out.println(totalPaths);
    }
}
