import java.util.Scanner;

// http://codeforces.com/problemset/problem/705/A
public class _705A_Hulk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sb.append("I hate it ");
            } else {
                sb.append("I love it ");
            }
        }

        sb = new StringBuilder(sb.toString().replaceAll("it", "that"));
        sb.replace(sb.length() - 5, sb.length(), "it");

        System.out.println(sb.toString());
    }

}
