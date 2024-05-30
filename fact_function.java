public class fact_function {
    public static int calFcatorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm = calFcatorial(n - 1);
        int fact_n = n * fact_nm;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 3;
        int ans = calFcatorial(n);
        System.out.println(ans);

    }
}
