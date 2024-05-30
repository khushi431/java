public class calculatepower {
    public static int calPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xpownm1 = calPower(x, n - 1);
        int xpow = x * xpownm1;
        return xpow;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calPower(x, n);
        System.out.println(ans);

    }
}
