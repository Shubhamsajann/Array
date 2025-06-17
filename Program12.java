import java.util.Arrays; // For printing arrays

public class Program12 {

    // Method to sort the array using bubble sort algorithm
    public static int[] sort(int[] a){
        int temp;

        // Outer loop for number of passes
        for (int j = 0; j < a.length; j++) {

            // Inner loop to compare adjacent elements
            for (int i = 0; i < a.length - 1; i++) {

                // Swap if elements are out of order
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }

        return a; // Return the sorted array
    }

    public static void main(String[] args) {

        // Initialize an array with elements
        int a[] = {10, 5, 77, 52, 9, 16, 13, 32};

        // Call sort method
        int[] ans = sort(a);

        // Print sorted array using loop
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // Print sorted array using built-in Arrays.toString()
        System.out.println("\n" + Arrays.toString(ans));

    }
}
