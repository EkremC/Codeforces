import java.util.Scanner;

// http://codeforces.com/problemset/problem/59/A
public class _59A_Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int l = 0;
        int u = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90)
                u++;
            else
                l++;
        }

        System.out.println(u > l ? s.toUpperCase() : s.toLowerCase());
    }

}
