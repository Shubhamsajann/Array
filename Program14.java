public class Program14 {

    // Method to swap the elements in the array (reverse the array)
    public static int[] swap(int[] arr) {
        // Initialize two pointers: i from start, j from end
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // Swap elements at index i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Return the reversed array
        return arr;
    }

    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = {10, 20, 30, 40, 50};

        // Call the swap method to reverse the array
        swap(arr);

        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Output: 50 40 30 20 10 
        }
        //   System.out.println(Arrays.toString(arr));
    }
}