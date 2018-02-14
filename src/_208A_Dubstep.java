import java.util.Scanner;

// http://codeforces.com/problemset/problem/208/A
public class _208A_Dubstep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("(WUB)+", " ");
        s = s.trim();
        System.out.println(s);
    }

}
