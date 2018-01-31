import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// http://codeforces.com/problemset/problem/133/A
public class _133A_HQ9Plus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        Matcher matcher = Pattern.compile("H|Q|9").matcher(word);
        if (matcher.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
