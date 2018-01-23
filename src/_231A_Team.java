import java.util.Scanner;

// http://codeforces.com/problemset/problem/231/A
public class _231A_Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int implemented = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) count++;
            if (sc.nextInt() == 1) count++;
            if (sc.nextInt() == 1) count++;

            if (count > 1) implemented++;
            count = 0;
        }

        System.out.println(implemented);
    }

}
