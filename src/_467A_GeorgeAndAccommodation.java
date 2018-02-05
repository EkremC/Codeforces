import java.util.Scanner;

// http://codeforces.com/problemset/problem/467/A
public class _467A_GeorgeAndAccommodation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;

        for(int i = 0; i < n; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();

            if(q - p >= 2)
                r++;
        }

        System.out.println(r);
    }

}
