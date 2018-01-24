import java.util.Scanner;

// http://codeforces.com/problemset/problem/112/A
public class _112A_PetyaAndStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next().toLowerCase();
        String second = sc.next().toLowerCase();
        int sum = 0;
        for (int i = 0; i < first.length(); i++) {
            sum += first.charAt(i) - second.charAt(i);
            if (sum != 0)
                break;
        }

        if (sum < 0) System.out.println("-1");
        else if (sum > 0) System.out.println("1");
        else System.out.println("0");

    }

}
