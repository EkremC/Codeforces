import java.util.Scanner;

// http://codeforces.com/problemset/problem/158/A
public class _158A_NextRound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        k -= 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int nextRound = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= arr[k] && arr[i] > 0) {
                nextRound++;
            } else {
                break;
            }
        }

        System.out.println(nextRound);
    }

}
