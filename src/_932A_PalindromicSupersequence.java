import java.util.Scanner;

// http://codeforces.com/problemset/problem/932/A
public class _932A_PalindromicSupersequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (a.equals(new StringBuilder(a).reverse().toString())) {
            System.out.println(a);
            System.exit(0);
        }

        StringBuilder sb = new StringBuilder();
        sb = sb.append(a).append(new StringBuilder(a).reverse().toString());
        System.out.println(sb.toString());

    }

}
