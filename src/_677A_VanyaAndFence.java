import java.util.Scanner;

// http://codeforces.com/problemset/problem/677/A
public class _677A_VanyaAndFence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();

        int w = 0;

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() > h)
                w += 2;
            else
                w++;
        }

        System.out.println(w);
    }

}
