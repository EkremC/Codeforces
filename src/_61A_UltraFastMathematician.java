import java.util.Scanner;

// http://codeforces.com/problemset/problem/61/A
public class _61A_UltraFastMathematician {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                System.out.print("1");
            else
                System.out.print("0");
        }
    }

}
