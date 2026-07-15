/************
import java.util.Scanner;

public class day3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int d = sc.nextInt();

        int count = 0;

        while (n > 0) {
            int digit = (int)(n % 10);

            if (digit == d)
                count++;

            n = n / 10;
        }
        sc.close();
        System.out.println(count);
    }
}
****************/

import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == n)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}