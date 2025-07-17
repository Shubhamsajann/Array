public class Program8 {

    //to print maximum element
    
    public static void main(String[] args) {
        
        // Declare and initialize array
        int[] arr ={12,23,19,10,5,90,-1};
        
        //assign any element to max
        int max=arr[0];
        
        // Loop through each element
        for(int i=0;i<arr.length;i++){
            
         if(arr[i]>max){
             max=arr[i];
         }
                
        }

        System.out.println(max);
    }
}

//output: 90
