import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] ary = new int[N];
        int money = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            //3개가 붙어있을 경우
            try {
                if(ary[i + 1] > ary[i + 2]) {
                    int min = Math.min(ary[i], ary[i + 1] - ary[i + 2]);
                    money += min * 5;

                    ary[i] -= min;
                    ary[i + 1] -= min;
                }

                int min = Math.min(ary[i], Math.min(ary[i + 1], ary[i + 2]));
                money += min * 7;
                ary[i] -= min;
                ary[i + 1] -= min;
                ary[i + 2] -= min;

            } catch (Exception e) {}
            //2개가 붙을 경우
            try {
                int min = Math.min(ary[i], ary[i + 1]);

                money += min * 5;
                ary[i] -= min;
                ary[i + 1] -= min;
            } catch (Exception e) {}
            //혼자만 가능한 경우
            money += ary[i] * 3;
        }

        bw.write(money + "\n");
        br.close();

        bw.flush();
        bw.close();
    }
}