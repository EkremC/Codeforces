import java.util.Scanner;

// http://codeforces.com/problemset/problem/946/A
public class _946A_Partition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = 0;
        int c = 0;
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            if (n >= 0)
                b += n;
            else
                c += n;
        }

        System.out.println(b - c);
    }

}
