import java.util.Scanner;

// http://codeforces.com/problemset/problem/486/A
public class _486A_CalculatingFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(((n / 2) + 1) * -1);
        }
    }

}
