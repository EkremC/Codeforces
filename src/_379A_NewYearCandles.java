import java.util.Scanner;

// http://codeforces.com/problemset/problem/379/A
public class _379A_NewYearCandles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a;

        while (a > 0) {
            c += a / b;
            if (a < b)
                break;
            int m = a % b;
            a /= b;
            a += m;
        }

        System.out.println(c);
    }

}
