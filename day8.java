import java.util.Scanner;

public class day8 {

    // Function to read array
    static void readArray(int arr[], int n, Scanner sc) {

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Function to find Kth largest element
    static int kthLargest(int arr[], int n, int k) {

        int maxIndex = -1;
        int max = Integer.MIN_VALUE;

        for (int count = 1; count <= k; count++) {

            max = Integer.MIN_VALUE;
            maxIndex = -1;

            for (int i = 0; i < n; i++) {

                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }

            // Mark the selected maximum so it is not chosen again
            arr[maxIndex] = Integer.MIN_VALUE;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        readArray(arr, n, sc);

        int k = sc.nextInt();

        System.out.println(kthLargest(arr, n, k));

        sc.close();
    }
}