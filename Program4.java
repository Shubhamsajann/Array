public class Program4 {
    
// Program to print even elements in the array
    
    public static void main(String[] args) {
        
        // Declare and initialize array
        int[] arr ={12,23,19,10,5,90};
        
        // Loop through each element
        for(int i=0;i<arr.length;i++){
            
            // Check if the element is even
            if(arr[i]%2 ==0){
                // Print the even element
                System.out.print(arr[i]+" ");
            }
            
        }

    }
}
/*
Output:
12 10 90
*/
