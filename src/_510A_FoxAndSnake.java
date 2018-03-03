import java.util.Scanner;

// http://codeforces.com/problemset/problem/510/A
public class _510A_FoxAndSnake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String s1 = s1(m);
        String s2 = s2(m);
        String s3 = s3(m);

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(s1);
            } else if (flag) {
                System.out.println(s2);
                flag = false;
            } else {
                System.out.println(s3);
                flag = true;
            }

        }

    }

    private static String s1(int m) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append("#");
        }

        return sb.toString();
    }

    private static String s2(int m) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m - 1; i++) {
            sb.append(".");
        }

        sb.append("#");

        return sb.toString();
    }

    private static String s3(int m) {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (int i = 0; i < m - 1; i++) {
            sb.append(".");
        }

        return sb.toString();
    }

}
