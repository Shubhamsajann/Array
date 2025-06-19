import java.util.Arrays;

public class Program15 {

    // Method to rotate array elements to the left by 1 position (anticlockwise)
    public static int[] antoclockwise(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // Shift each element to the previous index
            arr[i - 1] = arr[i];
        }
        return arr;  // The last element will be updated in main()
    }

    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = {10, 20, 30, 40, 50};

        // Store the first element temporarily (it will be moved to the end)
        int temp = arr[0];

        // Call the method to shift elements to the left
        antoclockwise(arr);

        // Place the first element at the end of the array
        arr[arr.length - 1] = temp;

        // Print the final rotated array
        System.out.println(Arrays.toString(arr));  // Output: [20, 30, 40, 50, 10]
    }
}
