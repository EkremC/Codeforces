import java.util.Scanner;

// http://codeforces.com/problemset/problem/116/A
public class _116A_Tram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxCap = 0;
        int inside = 0;
        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();

            inside -= exit;
            inside += enter;
            if (inside > maxCap) maxCap = inside;
        }

        System.out.println(maxCap);
    }

}
