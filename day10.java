import java.util.Scanner;

public class day10{

    // Function to read array
    static void readArray(int arr[], int n, Scanner sc) {

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Function to find longest subarray with at most two distinct numbers
    static int longestSubarray(int arr[], int n) {

        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            int first = -1;
            int second = -1;
            int distinct = 0;
            int length = 0;

            for (int j = i; j < n; j++) {

                if (first == -1 || arr[j] == first) {
                    if (first == -1) {
                        first = arr[j];
                        distinct++;
                    }
                }
                else if (second == -1 || arr[j] == second) {
                    if (second == -1) {
                        second = arr[j];
                        distinct++;
                    }
                }
                else {
                    break;
                }

                length++;

                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        readArray(arr, n, sc);

        System.out.println(longestSubarray(arr, n));

        sc.close();
    }
}