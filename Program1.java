import java.util.Scanner;

public class Program1 {
    // This program creates an integer array, takes user input for its elements,
    // and prints each element with its corresponding index.
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in); // Scanner object for input
        System.out.println("Enter the size of an array"); // Prompting user for array size
        int n = sc.nextInt(); // Reading array size from user
        int arr[] = new int[n]; // Declaring array of size 'n'

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt(); // Reading array elements from user
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+"--->"+arr[i]); // Printing index and element
        }
    }
}

/*
Sample Output:
Enter the size of an array
5
10
20
30
40
50
0--->10
1--->20
2--->30
3--->40
4--->50
*/
