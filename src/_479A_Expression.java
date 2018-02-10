import java.util.Scanner;

// http://codeforces.com/problemset/problem/479/A
public class _479A_Expression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int f = a + b * c;
        int s = a * (b + c);
        int t = a * b * c;
        int fo = (a + b) * c;
        int fi = a + b + c;

        System.out.println(Math.max(Math.max(Math.max(f, s), Math.max(t, fo)), fi));
    }

}
