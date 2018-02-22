import java.util.Scanner;

// http://codeforces.com/problemset/problem/460/A
public class _460A_VasyaAndSocks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int c = 0;
        while (n > 0) {
            c++;
            n--;
            if (c % m == 0)
                n++;
        }

        System.out.println(c);

    }

}
