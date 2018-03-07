import java.util.Scanner;

// http://codeforces.com/problemset/problem/71/A
public class _071A_WayTooLongWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(scanner.next());
            int length = sb.length();
            if(length > 10){
                sb.replace(1, length - 1, String.valueOf(length - 2));
                System.out.println(sb.toString());
                continue;
            }
            System.out.println(sb.toString());
        }
    }

}
