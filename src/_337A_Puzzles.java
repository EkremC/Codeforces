import java.util.Arrays;
import java.util.Scanner;

// http://codeforces.com/problemset/problem/337/A
public class _337A_Puzzles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            if (a[i + n - 1] - a[i] < min) {
                min = a[i + n - 1] - a[i];
            }
        }

        System.out.println(min);
    }

}
