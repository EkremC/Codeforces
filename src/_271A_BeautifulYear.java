import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// http://codeforces.com/problemset/problem/271/A
public class _271A_BeautifulYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n + 1; i <= 10000; i++) {
            if (isBeautifulYear(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    static boolean isBeautifulYear(int year) {
        String s = String.valueOf(year);
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(set.add(ch))) {
                return false;
            }
        }

        return true;
    }

}
