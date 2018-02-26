import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// http://codeforces.com/problemset/problem/228/A
public class _228A_IsYourHorseshoeOnTheOtherHoof {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] sa = s.split(" ");
        Set<String> set = new HashSet<>();

        for (String s1 : sa) {
            set.add(s1);
        }

        System.out.println(sa.length - set.size());
    }

}
