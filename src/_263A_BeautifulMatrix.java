import java.util.Scanner;

public class _263A_BeautifulMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = 0;
        int row = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num = sc.nextInt();
                if(num == 1){
                    row = i;
                    col = j;
                }
            }
        }

        int move = Math.abs(2-row);
        move += Math.abs(2-col);
        System.out.println(move);
    }

}
