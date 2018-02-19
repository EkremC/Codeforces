package CodeforcesRound465;

import java.util.Scanner;

public class _935B_FafaAndTheGates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int x = 0;
        int y = 0;
        int coin = 0;

        boolean xSide = true;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == 'U')
                x++;
            else
                y++;

            if (i == 0 && y > x) {
                xSide = false;
                continue;
            }
            if (xSide) {
                if (y > x) {
                    coin++;
                    xSide = false;
                }
            } else {
                if (x > y) {
                    coin++;
                    xSide = true;
                }
            }
        }

        System.out.println(coin);
    }

}
