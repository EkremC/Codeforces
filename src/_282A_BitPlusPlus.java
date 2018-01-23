import java.util.Scanner;

// http://codeforces.com/problemset/problem/282/A
public class _282A_BitPlusPlus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = 0;
        for(int i = 0; i < n; i++){
            if(sc.next().contains("+"))
                X++;
            else
                X--;
        }

        System.out.println(X);
    }

}
