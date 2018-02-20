import java.util.Scanner;

// http://codeforces.com/problemset/problem/344/A
public class _344A_Magnets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int g = 1;
        String f = sc.next();
        String prev = f;
        for (int i = 1; i < n; i++) {
            String c = sc.next();
            if (!c.equals(prev))
                g++;
            prev = c;
        }

        System.out.println(g);
    }

}
