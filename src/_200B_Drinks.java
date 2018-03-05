import java.util.Scanner;

// http://codeforces.com/problemset/problem/200/B
public class _200B_Drinks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        float vol = 0;
        for(int i = 0; i < n; i++){
            vol += sc.nextDouble() / 100;
        }
        System.out.println((vol / n) * 100);
    }

}
