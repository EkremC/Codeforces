import java.util.Scanner;

public class _935A_FafaAndHisCompany {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int l = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                l++;
        }

        System.out.println(l);


    }

}
