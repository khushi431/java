import java.util.ArrayList;

public class find_subsets {
    public static void printSubset(ArrayList<Integer> subset) { // time complexity : O(2^n)
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findSubset(n - 1, subset);

        // add nahi hoga
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);

    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
