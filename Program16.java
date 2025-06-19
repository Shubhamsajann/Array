import java.util.Arrays;

public class Program16 {

    // Method to shift array elements one position to the right
    public static int[] clockwise(int[] arr) {
        // Start from the second last element and shift each to the right
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        // Initialize the array
        int arr[] = {10, 20, 30, 40, 50};

        // Store the last element before shifting
        int temp = arr[arr.length - 1];

        // Shift elements one position to the right
        clockwise(arr);

        // Place the last element at the beginning
        arr[0] = temp;

        // Print the rotated array
        System.out.println(Arrays.toString(arr));  // Output: [50, 10, 20, 30, 40]
    }
}