import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// http://codeforces.com/problemset/problem/236/A
public class _236A_BoyOrGirl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Set<Character> set = new HashSet<>();
        int cn = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.add(ch))
                cn++;
        }

        System.out.println(cn % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }

}
