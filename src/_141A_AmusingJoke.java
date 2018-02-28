import java.util.Arrays;
import java.util.Scanner;

// http://codeforces.com/problemset/problem/141/A
public class _141A_AmusingJoke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        StringBuilder sb = new StringBuilder(a);
        sb.append(b);
        char[] ch = sb.toString().toCharArray();
        Arrays.sort(ch);

        char[] r = c.toCharArray();
        Arrays.sort(r);
        if (ch.length != r.length) {
            System.out.println("NO");
        } else {
            boolean same = true;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != r[i]) {
                    same = false;
                    break;
                }
            }

            System.out.println(same ? "YES" : "NO");
        }
    }

}
