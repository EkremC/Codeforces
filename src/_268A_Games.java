import java.util.Scanner;

// http://codeforces.com/problemset/problem/268/A
public class _268A_Games {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n * 2];

        int b = -1;
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int g = sc.nextInt();
            a[++b] = h;
            a[b++ + 1] = g;
        }

        int c = 0;
        for (int i = 0; i < n * 2; i += 2) {
            for (int j = i + 3; j < n * 2; j += 2) {
                if (a[i] == a[j])
                    c++;
            }
        }

        for (int i = 1; i < n * 2; i += 2) {
            for (int j = i + 1; j < n * 2; j += 2) {
                if (a[i] == a[j])
                    c++;
            }
        }

        System.out.println(c);
    }

}
