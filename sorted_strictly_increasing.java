public class sorted_strictly_increasing {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1); // time complexity : O(n) = array length
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5 };
        System.out.println(isSorted(arr, 0));
    }
}
