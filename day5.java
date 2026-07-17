//Count Positive, Negative and Zero Elements
/******************

import java.util.Scanner;

public class day5 {
    static void readArray(int[] arr, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void countElements(int[] arr, int n) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int[] arr = new int[n];
        readArray(arr, n, sc);
        countElements(arr, n);
        sc.close();
    }
}

***************/


/*********************** 
//Second Largest Element in an Array

import java.util.Scanner;

public class day5{

    static void readArray(int arr[], int n, Scanner sc) {

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static int secondLargest(int arr[], int n) {

        int largest = arr[0];
        int second = arr[1];

        if (second > largest) {
            int temp = largest;
            largest = second;
            second = temp;
        }

        for (int i = 2; i < n; i++) {

            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }
            else if (arr[i] > second) {
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        readArray(arr, n, sc);

        System.out.println(secondLargest(arr, n));
    }
}
*****************/