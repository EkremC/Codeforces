import java.util.Scanner;

// http://codeforces.com/problemset/problem/469/A
public class _469A_IWannaBeTheGuy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];

        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            a[sc.nextInt()]++;
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            a[sc.nextInt()]++;
        }

        boolean pass = true;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                pass = false;
                break;
            }
        }

        System.out.println(pass ? "I become the guy." : "Oh, my keyboard!");
    }

}
