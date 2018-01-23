import java.util.Scanner;

// http://codeforces.com/contest/914/problem/B
public class _914B_ConanAndAgasaPlayACardGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cards = new int[100001];
        for (int i = 1; i <= n; i++) {
            cards[scanner.nextInt()]++;
        }

        for (int i = 1; i <= 100000; i++) {
            if (cards[i] % 2 == 1) {
                System.out.println("Conan");
                System.exit(0);
            }
        }

        System.out.println("Agasa");
    }

}


