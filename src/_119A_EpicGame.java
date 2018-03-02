import java.util.Scanner;

// http://codeforces.com/problemset/problem/119/A
public class _119A_EpicGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        boolean simon = true;

        while (n > 0) {
            if (simon) {
                int gcd = gcd(a, n);
                n -= gcd;
            } else {
                int gcd = gcd(b, n);
                n -= gcd;
            }

            simon = !simon;
        }

        System.out.println(!simon ? "0" : "1");

    }


    private static int gcd(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }

        return gcd;
    }

}
