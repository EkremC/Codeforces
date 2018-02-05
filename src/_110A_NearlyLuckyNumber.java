import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// http://codeforces.com/problemset/problem/110/A
public class _110A_NearlyLuckyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        long c = 0;

        Matcher m = Pattern.compile("4|7").matcher(n);
        while (m.find())
            c++;

        int[] lucky = new int[]{4, 7, 47, 74, 447, 474, 477, 774, 744, 747};

        if (c != 0) {
            for (int j = 0; j < 10; j++) {
                if (c == lucky[j]) {
                    System.out.println("YES");
                    System.exit(0);
                }

            }
        }


        System.out.println("NO");
    }

}
