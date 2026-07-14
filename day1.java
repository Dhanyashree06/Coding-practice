/*********************
import java.util.Scanner;

public class day1 {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            int T = sc.nextInt();
            while (T-- > 0) {
                long N = sc.nextLong();
                int count = 0;
                while (N > 0) {
                    if ((N & 1) == 1)
                    count++;

                N = N >> 1;
                }

            if (isPrime(count))
                System.out.println("Binary prime");
            else
                System.out.println("-1");
            }
        }
    }
}

*******************/

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long moves = (n + m - 1) / m;

        System.out.println(moves);
    }
}