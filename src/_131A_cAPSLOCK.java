import java.util.Scanner;

// http://codeforces.com/problemset/problem/131/A
public class _131A_cAPSLOCK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char firstCh = str.charAt(0);
        boolean isFirstUpper = Character.isUpperCase(firstCh);
        boolean isChangeRequired = false;
        int a = 0;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                a++;
            } else {
                break;
            }
        }

        if (str.length() == 1) {
            if (isFirstUpper)
                System.out.println(str.toLowerCase());
            else
                System.out.println(str.toUpperCase());
        } else {
            if (isFirstUpper && a == str.length() - 1) {
                System.out.println(str.toLowerCase());
            } else if (!isFirstUpper && a == str.length() - 1) {
                System.out.println(Character.toUpperCase(firstCh) + str.substring(1).toLowerCase());
            } else {
                System.out.println(str);
            }
        }
    }

}
