import java.util.Scanner;

// http://codeforces.com/problemset/problem/734/A
public class _734A_AntonAndDanik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int a = 0;
        int d = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A')
                a++;
            else
                d++;
        }

        System.out.println(a > d ? "Anton" : a < d ? "Danik" : "Friendship");
    }

}
