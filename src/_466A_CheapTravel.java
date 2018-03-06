import java.util.Scanner;

// http://codeforces.com/problemset/problem/466/A
public class _466A_CheapTravel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mPrice = 0;
        int mnPrice = 0;
        int mTicket = n / m;
        mPrice += mTicket * b;
        mnPrice += mPrice;
        if (mTicket * m < n) {
            mPrice += b;
        }

        if (mTicket * m < n) {
            int nTicket = n % m;
            mnPrice += nTicket * a;
        }

        int nPrice = n * a;

        int min = Math.min(mPrice, mnPrice);


        System.out.println(Math.min(nPrice, min));

    }

}
