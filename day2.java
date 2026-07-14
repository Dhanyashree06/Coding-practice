/****************
import java.util.Scanner;

public class day2 {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int start = Math.min(A, B);
            int end = Math.max(A, B);

            int count = 0;

            for (int i = start + 1; i < end; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
} 
*******************/

//lcm&gcd
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = x;
        int b = y;

        // Find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Find LCM
        int lcm = (x * y) / a;

        System.out.println(lcm);
    }
}