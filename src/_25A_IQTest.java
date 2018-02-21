import java.util.Scanner;

// http://codeforces.com/problemset/problem/25/A
public class _25A_IQTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int even = 0, odd = 0;
        int ei = 0, oi = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a % 2 == 0) {
                even++;
                ei = i + 1;
            } else {
                odd++;
                oi = i + 1;
            }

            if (even > 1 && odd == 1) {
                System.out.println(oi);
                break;
            } else if (odd > 1 && even == 1) {
                System.out.println(ei);
                break;
            }

        }

    }

}
