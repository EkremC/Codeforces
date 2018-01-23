import java.util.Scanner;

// http://codeforces.com/problemset/problem/50/A
public class _50A_DominoPilling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int dominoes = (int) (Math.ceil(m / 2) * Math.ceil(n / 1));
        if (m % 2 == 1) {
            dominoes += (int) (Math.ceil(n / 2));
        }
        System.out.println(dominoes);
    }

}
