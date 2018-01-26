import java.util.Scanner;

// http://codeforces.com/problemset/problem/266/A
public class _266A_StonesOnTheTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int removed = 0;
        for(int i = 0; i < n - 1; i++){
            char ch = s.charAt(i);
            char chNext = s.charAt(i + 1);
            if(ch == chNext) removed++;
        }

        System.out.println(removed);
    }

}
