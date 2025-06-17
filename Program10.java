public class Program10 {

    // Linear Search Method: Searches for the key in the array
    public static int linear_search(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            // If the key is found at index i, return the index
            if (a[i] == key) {
                return i;
            }
        }
        // If the key is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Declare and initialize the array
        int[] a = {12, 23, 34, 45, 56, 67};

        // Define the key to search for
        int key = 45;

        // Call linear_search method to find the index of key
        int idx = linear_search(a, key);

        // Print the index of the key
        System.out.println(idx);  // Output: 3
    }
}
