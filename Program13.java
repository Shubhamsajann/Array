public class Program13 {
    public static boolean issorted(int arr[]){

        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
               return false;
            }

        }
        return true;


    }

    //to finnd array is sorted or not
    public static void main(String[] args) {
int[] arr= {10,20,30,40,50};



boolean sorted=issorted(arr);
        System.out.println(sorted);




    }
  
}
