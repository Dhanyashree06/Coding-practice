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

        System.out.println(count);
    }
}