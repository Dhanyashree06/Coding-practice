//contiguous increasing subarray
/***************
import java.util.Scanner;
public class day7{
    static void readArray(int arr[], int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int longestIncreasing(int arr[],int n){
        int currentLength=0;
        int maximumLength=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i-1]){
                currentLength++;
            }
            else{
                currentLength=1;
            }
            if(currentLength>maximumLength){
                maximumLength=currentLength;
            }
        }
        return maximumLength;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        readArray(arr,n,sc);
        System.out.println(longestIncreasing(arr,n));
    }
    
}

**************/

//Running Sum of 1D Array

/***************
 
import java.util.Scanner;

public class day7 {

    // Function to read array
    static void readArray(int arr[], int n, Scanner sc) {

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Function to print running sum
    static void runningSum(int arr[], int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum = sum + arr[i];

            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        readArray(arr, n, sc);

        runningSum(arr, n);

        sc.close();
    }
}
***********/