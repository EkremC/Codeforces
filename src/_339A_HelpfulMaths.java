import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// http://codeforces.com/problemset/problem/339/A
public class _339A_HelpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        List<Integer> listInt = new ArrayList<>();

        for (int i = 0; i < n.length(); i += 2) {
            listInt.add(Integer.valueOf(n.charAt(i)+""));
        }

        Collections.sort(listInt);

        for (int i = 0; i < listInt.size() - 1; i++) {
            System.out.print(listInt.get(i) + "+");
        }

        System.out.println(listInt.get(listInt.size()-1));
    }
}
