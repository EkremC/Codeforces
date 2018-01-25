import java.util.Scanner;

// http://codeforces.com/problemset/problem/281/A
public class _281A_WordCapitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        StringBuilder sb = new StringBuilder(word);
        sb.replace(0, 1, sb.substring(0,1).toUpperCase());
        System.out.println(sb.toString());
    }

}
