import java.util.Scanner;

// http://codeforces.com/problemset/problem/96/A
public class _096A_Football {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println((n.contains("0000000") || n.contains("1111111")) ? "YES" : "NO");
    }

}
