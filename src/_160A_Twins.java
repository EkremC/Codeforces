import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//http://codeforces.com/problemset/problem/160/A
public class _160A_Twins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> listInt = new ArrayList<>();
        int sum = 0;
        int ft = 0;

        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            sum += c;
            listInt.add(c);
        }

        Collections.sort(listInt);
        int cm = 0;
        for (int i = listInt.size() - 1; i >= 0; i--) {
            ft += listInt.get(i);
            sum -= listInt.get(i);
            cm++;
            if (ft > sum) {
                break;
            }
        }

        System.out.println(cm);
    }

}
