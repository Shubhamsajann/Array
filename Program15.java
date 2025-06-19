import java.lang.reflect.Array;
import java.util.Arrays;

public class Program15 {
    public static int[] antoclockwise

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int temp = arr[0];
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
