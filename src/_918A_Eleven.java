import java.util.Scanner;

// http://codeforces.com/problemset/problem/918/A
public class _918A_Eleven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(isFibonacci(i))
                sb.append("O");
            else
                sb.append("o");
        }

        System.out.println(sb.toString());
    }

    private static boolean isFibonacci(int n){
        int f = 1;
        int s = 2;
        if(n == f || n == 2) return true;
        int curr = f + s;
        int i = 0;
        while (i < n){
            if(n == curr) return true;
            f = s;
            s = curr;
            curr = f + s;
            i++;
        }

        return false;
    }

}
