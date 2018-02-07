import java.util.Scanner;

// http://codeforces.com/problemset/problem/41/A
public class _41A_Translation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String s = sc.next();

        System.out.println(new StringBuilder(t).reverse().toString().equals(s) ? "YES" : "NO");
    }

}
