public class Program7 {
    // Program to average all elements in the array
    public static void main(String[] args) {
        // Declare and initialize array
        int[] arr ={12,23,19,10,5,90};
        int sum =0;
        // Loop through each element
        for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];// sum the  element

        }
        System.out.print(sum/arr.length);
    }

}
//output:26