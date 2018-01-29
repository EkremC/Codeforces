import java.util.Scanner;

// http://codeforces.com/problemset/problem/158/B
public class _158B_Taxi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[5];

        for (int i = 0; i < n; i++) {
            a[sc.nextInt()]++;
        }

        int taxi = 0;
        taxi += a[4];
        taxi += a[3];
        a[1] = a[1] - a[3];


        if (((a[2] * 2) % 4) == 2) {
            int requiredFor2 = ((a[2] * 2) / 4) + 1;
            taxi += requiredFor2;
            if (a[1] > 0) {
                a[1] = a[1] - 2;
            }
        } else {
            int requiredFor2 = (a[2] * 2) / 4;
            taxi += requiredFor2;
        }

        if (a[1] > 0) {
            int requiredFor1 = a[1] / 4;
            if (requiredFor1 * 4 == a[1]) {
                taxi += requiredFor1;
            } else {
                taxi += requiredFor1 + 1;
            }

        }

        System.out.println(taxi);
    }

}
