import java.util.Scanner;

// http://codeforces.com/problemset/problem/451/A
public class _451A_GameWithSticks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int intSec = n * m;
        boolean akshat = true;

        int max = Math.max(n, m);

        while (intSec > 0) {
            intSec -= max;
            akshat = !akshat;
        }

        System.out.println(akshat ? "Malvika" : "Akshat");

    }

}
