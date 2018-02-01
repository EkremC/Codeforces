import java.util.Scanner;

// http://codeforces.com/contest/58/problem/B
public class _58B_Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = n;

        for (int i = n; i > 0; i--) {
            if (n % i == 0 && last % i == 0) {
                System.out.print(i + " ");
                last = i;
            }

        }
    }

}
