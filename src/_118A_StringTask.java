import java.util.Scanner;

// http://codeforces.com/problemset/problem/118/A
public class _118A_StringTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder builder = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != 'a' && ch != 'o' && ch != 'i' && ch != 'e' && ch != 'u' && ch != 'y'){
                builder.append('.').append(ch);
            }
        }

        System.out.println(builder.toString());
    }

}
