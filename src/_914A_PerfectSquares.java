import java.util.Scanner;

// http://codeforces.com/contest/914/problem/A
public class _914A_PerfectSquares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int sqrt = (int) Math.sqrt(a);

            if ((sqrt * sqrt) != a && a > largest)
                largest = a;
        }

        System.out.println(largest);
    }

}

