import java.util.Scanner;

// http://codeforces.com/problemset/problem/4/A
public class _04A_Watermelon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();

        System.out.println(((w % 2 == 0) && w > 2) ? "YES" : "NO");
    }

}
