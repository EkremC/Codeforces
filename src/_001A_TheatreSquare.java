import java.util.Scanner;

// http://codeforces.com/problemset/problem/1/A
public class _001A_TheatreSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();
        double a = scanner.nextDouble();

        double needed = Math.ceil(n / a) * Math.ceil(m / a);
        System.out.printf("%.0f", needed);
    }

}
