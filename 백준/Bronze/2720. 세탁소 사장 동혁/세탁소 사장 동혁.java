import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        int T = Integer.parseInt(br.readLine());
        int[] coin = new int[]{25, 10, 5, 1};

        while(T-- > 0) {
            sb = new StringBuilder();
            int money = Integer.parseInt(br.readLine());
            for(int i = 0; i < coin.length; i++) {
                sb.append(money / coin[i] + " ");
                money = money % coin[i];
            }
            System.out.println(sb.toString());
        }

        br.close();
    }
}