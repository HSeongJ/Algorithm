import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] weight = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            weight[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(weight);

        int num = 0;
        for(int i = 0; i < weight.length; i++) {
            if(num + 1 < weight[i]) {
                break;
            }
            num += weight[i];
        }

        bw.write((num + 1) + "\n");

        br.close();

        bw.flush();
        bw.close();
    }
}