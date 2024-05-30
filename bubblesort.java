public class bubblesort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        // time complexity - o(n^2)
        // buuble sort
        for (int i = 0; i < arr.length - 1; i++) { // n-1
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
  


// time complexity - o(N) already sorted array

// public class bubblesort {
//     public static void main(String[] args) {
//         int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // Example sorted array
//         BubbleSort(array);
//         for (int num : array) {
//             System.out.print(num + " ");
//         }
//     }

//     public static void BubbleSort(int[] array) {
//         int n = array.length;
//         boolean swapped;
//         for (int i = 0; i < n - 1; i++) {
//             swapped = false;
//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (array[j] > array[j + 1]) {
//                     // Swap array[j] and array[j + 1]
//                     int temp = array[j];
//                     array[j] = array[j + 1];
//                     array[j + 1] = temp;
//                     swapped = true;
//                 }
//             }
//             // If no two elements were swapped by inner loop, then break
//             if (!swapped) break;
//         }
//     }
// }
