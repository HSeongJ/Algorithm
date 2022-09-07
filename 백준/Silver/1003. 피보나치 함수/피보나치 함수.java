import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int count0;
    static int count1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            count0 = 0;
            count1 = 0;

            fibonacci(Integer.parseInt(br.readLine()));
            sb.append(count0).append(" ").append(count1).append("\n");
        }

        bw.write(sb.toString());

        br.close();

        bw.flush();
        bw.close();
    }

    static void fibonacci(int n) {
        int temp1 = 0;
        int temp2= 1;
        int temp = 0;

        if(n == 0) {
            count0++;
        } else if(n == 1) {
            count1++;
        } else if(n < 0) {
            return;
        } else {
            for(int i = 1 ; i < n ; i++) {
                temp = temp1 + temp2;
                temp1 = temp2;
                temp2 = temp;
            }
            count0 = temp1;
            count1 = temp2;
        }
    }
}