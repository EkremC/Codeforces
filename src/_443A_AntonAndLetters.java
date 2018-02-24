import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// http://codeforces.com/problemset/problem/443/A
public class _443A_AntonAndLetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '{' && c != '}' && c != ',' && c != ' ')
                set.add(c);
        }

        System.out.println(set.size());

    }

}
