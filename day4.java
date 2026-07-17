/***************** 
//Nearest Prime Number 

import java.util.Scanner;

public class day4 {

    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    static int nearestPrime(int n) {

        if (isPrime(n))
            return n;

        int distance = 1;

        while (true) {

            if (isPrime(n - distance))
                return n - distance;

            if (isPrime(n + distance))
                return n + distance;

            distance++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(nearestPrime(n));

            sc.close();

    }
}

**************/

//   Sum of Digits Until Prime 
/****************

import java.util.Scanner;

public class day4{

    static int sumOfDigits(int n) {

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    static void reduceToPrime(int n) {

        if (isPrime(n)) {
            System.out.println(n);
            return;
        }

        int previous = -1;

        while (true) {

            int sum = sumOfDigits(n);

            if (isPrime(sum)) {
                System.out.println(sum);
                return;
            }

            if (sum == previous) {
                System.out.println("NOT POSSIBLE");
                return;
            }

            previous = sum;
            n = sum;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        reduceToPrime(n);

        sc.close();
    }
}

************************/