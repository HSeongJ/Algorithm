import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] rank = new int[N];
        for(int i = 0; i < N; i++){
            rank[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rank);

        long sum = 0;
        for(int i = 0; i < N; i++) {
            int sub = (i+1) - rank[i];
            sum += Math.abs(sub);
        }

        System.out.println(sum);
        br.close();
    }
}