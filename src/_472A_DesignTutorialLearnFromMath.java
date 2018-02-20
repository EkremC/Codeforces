import java.util.Scanner;

// http://codeforces.com/problemset/problem/472/A
public class _472A_DesignTutorialLearnFromMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 4; i < n; i++) {
            int sec = n - i;
            if (!isPrime(i) && !isPrime(sec)) {
                System.out.println(i + " " + sec);
                break;
            }
        }
    }



    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }



}

// 58113