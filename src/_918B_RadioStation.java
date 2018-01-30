import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _918B_RadioStation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String ip = sc.next();

            map.put(ip, name);
        }

        for (int i = 0; i < m; i++) {
            String name = sc.next();
            String ip = sc.next();

            String ipName = map.get(ip.substring(0, ip.length() - 1));
            System.out.println(name + " " + ip + " #" + ipName);
        }
    }
}
