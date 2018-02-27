import java.util.Scanner;

// http://codeforces.com/problemset/problem/520/A
public class _520A_Pangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        s = s.toLowerCase();
        char[] c = new char[26];

        if (n < 26) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < n; i++) {
                c[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < c.length; i++) {
                if (c[i] == 0) {
                    System.out.println("NO");
                    System.exit(0);
                }
            }

            System.out.println("YES");
        }


    }

}
