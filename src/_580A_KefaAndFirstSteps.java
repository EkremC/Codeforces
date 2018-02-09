import java.util.Scanner;

// http://codeforces.com/problemset/problem/580/A
public class _580A_KefaAndFirstSteps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev = sc.nextInt();
        int subMax = 1;
        int subCurr = 1;
        for (int i = 1; i < n; i++) {
            int c = sc.nextInt();
            if (c >= prev) {
                subCurr++;
                if (subCurr > subMax) {
                    subMax = subCurr;
                }
            } else {
                subCurr = 1;
            }

            prev = c;
        }

        System.out.println(subMax);
    }

}
