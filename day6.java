//Check Array is Strictly Increasing

/******************

import java.util.Scanner;

public class day6 {

    static void readArray(int arr[], int n, Scanner sc) {

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static int isIncreasing(int arr[], int n) {

        for (int i = 1; i < n; i++) {

            if (arr[i] <= arr[i - 1]) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        readArray(arr, n, sc);

        if (isIncreasing(arr, n) == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

************/


//Count Even Numbers Greater than Average

/**********
 
import java.util.Scanner;

public class day6 {

    // Function to read array
    static void readArray(int arr[], int n, Scanner sc) {

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Function to find average
    static float findAverage(int arr[], int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return (float) sum / n;
    }

    // Function to count even numbers greater than average
    static int countEvenGreaterThanAverage(int arr[], int n) {

        float average = findAverage(arr, n);
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 == 0 && arr[i] > average) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        readArray(arr, n, sc);

        int result = countEvenGreaterThanAverage(arr, n);

        System.out.println(result);

        sc.close();
    }
}

***********/