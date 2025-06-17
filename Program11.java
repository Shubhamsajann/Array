public class Program11 {
    // Binary search method
    public static int binary_search(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                return mid; // Key found
            } else if (key > a[mid]) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        // Array must be sorted in increasing order
        int[] a = {1, 2, 3, 4, 10, 20, 100, 500};

        // Define the key to search for
        int key = 10;

        // Call binary_search method to find the index of key
        int idx = binary_search(a, key);

        // Print the index of the key
        System.out.println(idx);  // Output should be: 0
    }
}