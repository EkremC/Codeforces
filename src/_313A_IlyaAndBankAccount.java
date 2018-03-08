import java.util.Scanner;

// http://codeforces.com/problemset/problem/313/A
public class _313A_IlyaAndBankAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder n = new StringBuilder(sc.next());

        if (Integer.valueOf(n.toString()) > 0) {
            System.out.println(n);
        } else {
            int dLast = Integer.valueOf(n.substring(0, n.length() - 1));
            int dBfrLast = Integer.valueOf(n.deleteCharAt(n.length() - 2).toString());

            System.out.println(dLast > dBfrLast ? dLast : dBfrLast);
        }

    }

}
