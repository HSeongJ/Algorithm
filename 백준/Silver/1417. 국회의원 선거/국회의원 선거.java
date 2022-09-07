import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int me = Integer.parseInt(br.readLine());

        if(N == 1) {
            System.out.println(0);
            return;
        }

        int[] vote = new int[N - 1];
        int count = 0;

        for(int i = 0; i < N - 1; i++) {
            vote[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(vote);

        int max = vote[vote.length-1];
        while(true) {
            boolean max_minus = true;
            if(me > max) {
                break;
            }
            for(int i = 0; i < N - 1; i++) {
                if(vote[i] == max) {
                    max_minus = false;
                    vote[i]--;
                    me++;
                    count++;
                    break;
                }
            }
            if(max_minus) {
                max--;
            }
        }

        System.out.println(count);
        br.close();
    }
}