import java.util.Scanner;

// http://codeforces.com/problemset/problem/122/A
public class _122A_LuckyDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String d = s.replaceAll("4", "");
        d = d.replaceAll("7", "");

        if (d.equals("")) {
            System.out.println("YES");
            System.exit(0);
        }
        int[] lucky = new int[]{4, 7, 47, 74, 447, 474, 477, 774, 744, 747};
        int i = Integer.valueOf(s);

        for (int j = 0; j < 10; j++) {
            if (i == lucky[j] || i % lucky[j] == 0) {
                System.out.println("YES");
                System.exit(0);
            }

        }

        System.out.println("NO");

    }

}
