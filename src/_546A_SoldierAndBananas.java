import java.util.Scanner;

// http://codeforces.com/problemset/problem/546/A
public class _546A_SoldierAndBananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }

        System.out.println((sum <= n) ? 0 : sum - n);
    }

}
