public class Program9 {
    // Program to print the second maximum element in an array

    public static void main(String[] args) {
        // Initialize the array
        int arr[] = {1, 2, 3, 4, 5, 2, 7, 10};

        // Assume the first element as max1 and the second as max2
        int max1 = arr[0];
        int max2 = arr[1];

        // Swap max1 and max2 if first element is greater than second
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        // Loop through the rest of the array to find max1 and max2
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                // If current element is greater than max1, update both max1 and max2
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                // If current element is greater than max2 and not equal to max1, update max2
                max2 = arr[i];
            }
        }

        // Print the second maximum value
        System.out.println("Second maximum element: " + max2);


    }
}
// Output:
// Second maximum element: 7
