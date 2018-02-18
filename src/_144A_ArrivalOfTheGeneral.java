import java.util.Scanner;

// http://codeforces.com/problemset/problem/144/A
public class _144A_ArrivalOfTheGeneral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIn = 0;
        int minIn = 0;

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k > max) {
                max = k;
                maxIn = i;
            }

            if (k <= min) {
                min = k;
                minIn = i;
            }

        }

        int swap = 0;
        swap += maxIn - 0;
        swap += n - 1 - minIn;
        if (maxIn > minIn) {
            System.out.println(swap - 1);
        } else {
            System.out.println(swap);
        }

    }

}
