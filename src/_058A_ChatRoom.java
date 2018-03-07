import java.util.Scanner;

// http://codeforces.com/problemset/problem/58/A
public class _058A_ChatRoom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        int h = line.indexOf('h');
        int e = line.indexOf('e', h);
        int fl = line.indexOf('l', e);
        int sl = line.indexOf('l', fl + 1);
        int o = line.indexOf('o', sl);

        if(h < e && e < fl && fl < sl && sl < o)
            System.out.println("YES");
        else
            System.out.println("NO");
    }


}
