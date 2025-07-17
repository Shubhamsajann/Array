public class Program2 {
    
    //add element x=35 at index 3
    
    public static void main(String[] args) {

        // Declare and initialize the original array
        int[] arr = {10, 20, 30, 40, 50, 60};

        // Index at which the new element should be inserted
        int index = 3;

        // Value to be inserted
        int x = 35;

        // Create a new array with one more element than the original
        int[] arr1 = new int[arr.length + 1];

        // Copy elements from the original array to the new array up to the given index
        for (int i = 0; i < index; i++) {
            arr1[i] = arr[i];
        }

        // Insert the new element at the specified index
        arr1[index] = x;

        // Copy the remaining elements from the original array to the new array
        for (int i = index; i < arr.length; i++) {
            arr1[i + 1] = arr[i];
        }

        // Print the new array
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Output:
        // 10 20 30 35 40 50 60
    }
}
