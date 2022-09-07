import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] val = new Integer[26];
        Arrays.fill(val, 0);

        for(int i = 0; i < N; i++) {
            String str = br.readLine();

            for(int j = 0; j < str.length(); j++) {
                val[str.charAt(j) - 65] += (int)Math.pow(10, str.length() - (j + 1));
            }
        }

        Arrays.sort(val, Collections.reverseOrder());

        int sum = 0;
        int num = 9;
        for(int i = 0; i < val.length; i++) {
            if(val[i] == 0) {
                break;
            }
            sum += val[i] * num--;
        }

        System.out.println(sum);
        br.close();
    }
}