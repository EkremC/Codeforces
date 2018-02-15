import java.util.Scanner;

// http://codeforces.com/problemset/problem/617/A
public class _617A_Elephant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int m = x % 5;
        int step = x / 5;

        System.out.println(m == 0 ? step : step + 1);
    }

}
