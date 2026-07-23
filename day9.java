//Missing Number

/*****************
import java.util.Scanner;

public class day9 {

    // Function to read array
    static void readArray(int arr[], int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Function to find missing number
    static int findMissingNumber(int arr[], int n) {

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        readArray(arr, n, sc);

        System.out.println(findMissingNumber(arr, n));

        sc.close();
    }
}

*****************/

//Shortest Unsorted Continuous Subarray

import java.util.Scanner;

public class day9 {

    static void readArray(int arr[], int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static int shortestUnsortedSubarray(int arr[], int n) {

        int left = 0;

        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }

        if (left == n - 1)
            return 0;

        int right = n - 1;

        while (right > 0 && arr[right] >= arr[right - 1]) {
            right--;
        }

        int min = arr[left];
        int max = arr[left];

        for (int i = left; i <= right; i++) {

            if (arr[i] < min)
                min = arr[i];

            if (arr[i] > max)
                max = arr[i];
        }

        while (left > 0 && arr[left - 1] > min) {
            left--;
        }

        while (right < n - 1 && arr[right + 1] < max) {
            right++;
        }

        return right - left + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        readArray(arr, n, sc);

        System.out.println(shortestUnsortedSubarray(arr, n));

        sc.close();
    }
}