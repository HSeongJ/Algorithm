import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] time = new int[]{300, 60, 10};
        int count = 0;

        if(T % 10 != 0) {
            System.out.println(-1);
        } else {
            for(int i = 0; i < 3; i++) {
                count += T / time[i];
                sb.append(T / time[i] + " ");
                T = T % time[i];
            }
            System.out.println(sb.toString());
        }

        br.close();
    }
}