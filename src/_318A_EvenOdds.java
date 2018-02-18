import java.util.Scanner;

// http://codeforces.com/problemset/problem/318/A
public class _318A_EvenOdds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long even, odd;

        if (n % 2 == 0) {
            even = ((n - 2) / 2) + 1;
            odd = ((n - 2) / 2) + 1;
        } else {
            even = ((n - 1 - 2) / 2) + 1;
            odd = ((n - 1) / 2) + 1;
        }

        if (k <= odd) {
            System.out.println((k - 1) * 2 + 1);
        } else {
            long diff = k - odd;
            System.out.println((diff - 1) * 2 + 2);
        }


    }

}
