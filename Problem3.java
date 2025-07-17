public class Problem3 {
    //to remove the element at specific index;

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};

        int index=3;
        int[] arr1 = new int[arr.length -1];
        for (int i = 0; i <index ; i++) {
            // Copy elements before the index to be removed
            arr1[i]=arr[i];

        }
        for (int i = index+1; i < arr.length ; i++) {
            // Shift elements after the index to fill the gap
            arr1[i-1]=arr[i];

        }
        for (int i = 0; i < arr1.length; i++) {
            // Print the updated array after removal
            System.out.print(arr1[i] + " ");
        }

        // Output: 10 20 30 50
        
    }
}
