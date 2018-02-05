import java.util.Scanner;

// http://codeforces.com/problemset/problem/69/A
public class _69A_YoungPhysicist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i < n; i++){
            x += sc.nextInt();
            y += sc.nextInt();
            z += sc.nextInt();
        }

        System.out.println((x == 0 && y == 0 && z == 0) ? "YES" : "NO");
    }

}
