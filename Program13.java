public class Program13 {

    // Check if array is sorted in ascending order
    public static boolean isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    // Check if array is sorted in descending order
    public static boolean isSortedDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Check both ascending and descending
        if (isSortedAscending(arr)) {
            System.out.println("Array is sorted in ascending order.");
        } else if (isSortedDescending(arr)) {
            System.out.println("Array is sorted in descending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}