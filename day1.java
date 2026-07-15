import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long moves = (n + m - 1) / m;
        sc.close();
        System.out.println(moves);
    }
}